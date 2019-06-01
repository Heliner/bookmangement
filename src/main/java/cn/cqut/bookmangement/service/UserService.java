package cn.cqut.bookmangement.service;

import cn.cqut.bookmangement.DTO.SearchContent;
import cn.cqut.bookmangement.DTO.UserCenterDTO;
import cn.cqut.bookmangement.entity.*;
import cn.cqut.bookmangement.exception.NullOrEmptyException;
import cn.cqut.bookmangement.mapper.UserMapper;
import cn.cqut.bookmangement.util.PageHelper;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    BorrowRecordService borrowRecordService;

    @Autowired
    SysAdminService sysAdminService;
    @Autowired
    BookAdminService bookAdminService;

    public void insert(User user) {
        userMapper.insertSelective(user);
    }

    public User getOneByPk(User user) {
        User rse = userMapper.selectByPrimaryKey(user.getUserId());
        rse.setPassword(null);
        return rse;
    }

    //todo 之前的密码有误
    public void update(UserCenterDTO user, HttpServletRequest request) {
        if (!Objects.equals(user.getnPassword(), user.getcPassword()))
            throw new NullOrEmptyException("密码不一致");
        User se = (User) request.getSession().getAttribute("user");
        User sUser = userMapper.selectByPrimaryKey(se.getUserId());
        if (!Objects.equals(sUser.getPassword(), user.getPassword()))
            throw new NullOrEmptyException("密码有误");
        sUser.setPassword(user.getnPassword());
        userMapper.updateByPrimaryKeySelective(sUser);
    }

    public void delete(User user) {
        userMapper.deleteByPrimaryKey(user.getUserId());
    }

    public void insertSelective(User user) {
        userMapper.insertSelective(user);
    }

    public UserExample selectPage(SearchContent searchContent) {
        if (StringUtils.isBlank(searchContent.getContent()))
            searchContent.setContent(null);

        UserExample userExample = new UserExample();
        userExample.clear();
        userExample.setCurrentPage(searchContent.getCurrentPage());
        PageHelper.generateCheckedHelper(userMapper.countForSearch(searchContent.getContent()), userExample);
        if (userExample.getCount() <= 0)
            return userExample;

        userExample.setData(userMapper.selectForSearch(searchContent.getContent(), userExample));
        return userExample;
    }

    public User selectPK(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    public void updateSelective(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    public void update(User user, HttpServletRequest request) {
        User tempuser = (User) request.getSession().getAttribute("user");
        user.setUserId(tempuser.getUserId());
        userMapper.updateByPrimaryKeySelective(user);
        request.getSession().setAttribute("user", userMapper.selectByPrimaryKey(user.getUserId()));
    }

    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    public List<Map> getOnRecBook(HttpServletRequest request) {
        User tempUser = (User) request.getSession().getAttribute("user");
        return borrowRecordService.selectRecByUserOnRec(tempUser);
    }

    public List<Map> getOnUnRecBook(HttpServletRequest request) {

        User tempUser = (User) request.getSession().getAttribute("user");
        return borrowRecordService.selectUnRecByUserOnRec(tempUser);
    }

    public Object login(UserLoginDTO userdto, HttpServletRequest request) {
        User user = new User();
        BeanUtils.copyProperties(userdto, user);
        HttpSession session = request.getSession();
        boolean exist = true;
        Object put2Session = null;
        Object userDB = userMapper.selectByPrimaryKey(user.getUserId());
        if (userDB != null && userdto.getRole() == 2 && ((User) userDB).getPassword().equals(user.getPassword())) {
            ((User) userDB).setPassword(null);
        } else if (1 == userdto.getRole() && (userDB = bookAdminService.selectAdminByPK(user.getUserId())) != null && ((BookAdmin) userDB).getAdpassword().equals(user.getPassword()))
            ((BookAdmin) userDB).setAdpassword(null);
        else if (0 == userdto.getRole() && (userDB = sysAdminService.selectByPK(user.getUserId())) != null && ((SysAdmin) userDB).getAdminpassword().equals(user.getPassword()))
            ((SysAdmin) userDB).setAdminpassword(null);
        else
            throw new NullOrEmptyException("用户不存在或密码错误");
        System.out.println("userlogin:" + userDB);

        session.setAttribute("user", userDB);
        return userDB;
    }

    public void loginOut(HttpServletRequest request) {
        request.getSession().setAttribute("user", null);
    }

    public Object getSysAdmin(HttpServletRequest request) {
        return request.getSession().getAttribute("user");
    }

    public void throwException() throws MySQLIntegrityConstraintViolationException {
        throw new MySQLIntegrityConstraintViolationException("a");
    }
}

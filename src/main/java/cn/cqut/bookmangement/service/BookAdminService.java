package cn.cqut.bookmangement.service;

import cn.cqut.bookmangement.DTO.BookAdminCenterDTO;
import cn.cqut.bookmangement.DTO.SearchContent;
import cn.cqut.bookmangement.entity.BookAdmin;
import cn.cqut.bookmangement.entity.BookAdminExample;
import cn.cqut.bookmangement.exception.NullOrEmptyException;
import cn.cqut.bookmangement.mapper.BookAdminMapper;
import cn.cqut.bookmangement.util.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class BookAdminService {
    @Autowired
    BookAdminMapper bookAdminMapper;

    //    @Transactional
    public BookAdminExample selectPage(SearchContent searchContent) {
        BookAdminExample bookAdminExample = new BookAdminExample();
        if (StringUtils.isBlank(searchContent.getContent()))
            searchContent.setContent(null);

        bookAdminExample.clear();
        bookAdminExample.setCurrentPage(searchContent.getCurrentPage());
        bookAdminExample.setCount((int) bookAdminMapper.countBySearch(searchContent.getContent()));
        if (bookAdminExample.getCount() <= 0)
            return bookAdminExample;
        PageHelper.generateCheckedHelper(bookAdminExample.getCount(), bookAdminExample);

        bookAdminExample.setData(bookAdminMapper.selectBySearch(searchContent.getContent(), bookAdminExample));
        return bookAdminExample;
    }


    public BookAdmin getOne(BookAdmin bookAdmin) {
        return bookAdminMapper.selectByPrimaryKey(bookAdmin.getAdid());
    }


    public void insert(BookAdmin bookAdmin) {
        bookAdminMapper.insertSelective(bookAdmin);
    }

    public void delete(BookAdmin bookAdmin) {
        bookAdminMapper.deleteByPrimaryKey(bookAdmin.getAdid());
    }

    public void update(BookAdmin bookAdmin) {
        bookAdminMapper.updateByPrimaryKeySelective(bookAdmin);
    }

    public void update(BookAdminCenterDTO bookAdminCenterDTO, HttpServletRequest request) {
        if (!StringUtils.isBlank(bookAdminCenterDTO.getAdpassword()))
            if (!bookAdminCenterDTO.getAdcpassword().equals(bookAdminCenterDTO.getAdnpassword()))
                throw new NullOrEmptyException("两次密码不一样");
        String pk = ((BookAdmin) (request.getSession().getAttribute("user"))).getAdid();
        BookAdmin adminFromDB = bookAdminMapper.selectByPrimaryKey(pk);
        if (!StringUtils.isBlank(bookAdminCenterDTO.getAdpassword()))
            if (!bookAdminCenterDTO.getAdpassword().equals(adminFromDB.getAdpassword()))
                throw new NullOrEmptyException("密码不正确");

        BookAdmin bookAdmin = new BookAdmin();
        bookAdmin.setAdid(pk);
        BeanUtils.copyProperties(bookAdminCenterDTO, bookAdmin);
        bookAdmin.setAdpassword(bookAdminCenterDTO.getAdcpassword());

        bookAdminMapper.updateByPrimaryKeySelective(bookAdmin);
        request.getSession().setAttribute("user", bookAdminMapper.selectByPrimaryKey(pk));
    }


    public BookAdmin getBookAdmin(HttpServletRequest request) {
        return (BookAdmin) request.getSession().getAttribute("user");
    }

    public BookAdmin selectAdminByPK(String userId) {
        return bookAdminMapper.selectByPrimaryKey(userId);
    }
}

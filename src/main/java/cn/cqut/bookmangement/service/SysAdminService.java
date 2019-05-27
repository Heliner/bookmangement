package cn.cqut.bookmangement.service;

import cn.cqut.bookmangement.DTO.SysAdminCenterDTO;
import cn.cqut.bookmangement.entity.SysAdmin;
import cn.cqut.bookmangement.exception.NullOrEmptyException;
import cn.cqut.bookmangement.mapper.SysAdminMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class SysAdminService {
    @Autowired
    SysAdminMapper sysAdminMapper;

    public void update(SysAdminCenterDTO sysAdminCenterDTO, HttpServletRequest request) {
        if (!sysAdminCenterDTO.getAdmincpassword().equals(sysAdminCenterDTO.getAdminnpassword()))
            throw new NullOrEmptyException("两次密码不一样");
        String pk = ((SysAdmin) (request.getSession().getAttribute("user"))).getAdminid();
        SysAdmin adminFromDB = sysAdminMapper.selectByPrimaryKey(pk);
        if (!sysAdminCenterDTO.getAdminpassword().equals(adminFromDB.getAdminpassword()))
            throw new NullOrEmptyException("密码不正确");

        SysAdmin sysAdmin = new SysAdmin();
        BeanUtils.copyProperties(sysAdminCenterDTO, sysAdmin);
        sysAdminMapper.updateByPrimaryKey(sysAdmin);
    }

    public SysAdmin selectByPK(String userId) {
        return sysAdminMapper.selectByPrimaryKey(userId);
    }
}

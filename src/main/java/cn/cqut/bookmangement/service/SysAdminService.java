package cn.cqut.bookmangement.service;

import cn.cqut.bookmangement.DTO.SysAdminCenterDTO;
import cn.cqut.bookmangement.entity.SysAdmin;
import cn.cqut.bookmangement.exception.NullOrEmptyException;
import cn.cqut.bookmangement.mapper.SysAdminMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class SysAdminService {
    @Autowired
    SysAdminMapper sysAdminMapper;

    public void update(SysAdminCenterDTO sysAdminCenterDTO, HttpServletRequest request) {
        if (!StringUtils.isBlank(sysAdminCenterDTO.getAdminpassword())) {
            if (!sysAdminCenterDTO.getAdmincPassword().equals(sysAdminCenterDTO.getAdminnPassword()))
                throw new NullOrEmptyException("两次密码不一样");
        }
        String pk = ((SysAdmin) (request.getSession().getAttribute("user"))).getAdminid();
        SysAdmin adminFromDB = sysAdminMapper.selectByPrimaryKey(pk);
        if (!StringUtils.isBlank(sysAdminCenterDTO.getAdminpassword())) {
            if (!sysAdminCenterDTO.getAdminpassword().equals(adminFromDB.getAdminpassword()))
                throw new NullOrEmptyException("密码不正确");
        }
        SysAdmin sysAdmin = new SysAdmin();
        BeanUtils.copyProperties(sysAdminCenterDTO, sysAdmin);
        sysAdmin.setAdminpassword(sysAdminCenterDTO.getAdmincPassword());
        sysAdminMapper.updateByPrimaryKeySelective(sysAdmin);
        request.getSession().setAttribute("user",sysAdminMapper.selectByPrimaryKey(sysAdmin.getAdminid()));
    }

    public SysAdmin selectByPK(String userId) {
        return sysAdminMapper.selectByPrimaryKey(userId);
    }
}

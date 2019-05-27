package cn.cqut.bookmangement.mapper;

import cn.cqut.bookmangement.entity.SysAdmin;
import cn.cqut.bookmangement.entity.SysAdminExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SysAdminMapper {
    long countByExample(SysAdminExample example);

    int deleteByPrimaryKey(String adminid);

    int insert(SysAdmin record);

    int insertSelective(SysAdmin record);

    List<SysAdmin> selectByExample(SysAdminExample example);

    SysAdmin selectByPrimaryKey(String adminid);

    int updateByPrimaryKeySelective(SysAdmin record);

    int updateByPrimaryKey(SysAdmin record);
}
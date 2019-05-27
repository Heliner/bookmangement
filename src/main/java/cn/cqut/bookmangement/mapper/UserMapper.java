package cn.cqut.bookmangement.mapper;

import cn.cqut.bookmangement.entity.User;
import cn.cqut.bookmangement.entity.UserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int countForSearch(@Param("content") String content);

    List<User> selectForSearch(@Param("content") String content, @Param("example") UserExample userExample);

}

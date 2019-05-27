package cn.cqut.bookmangement.mapper;

import cn.cqut.bookmangement.entity.BookAdmin;
import cn.cqut.bookmangement.entity.BookAdminExample;
import cn.cqut.bookmangement.entity.UserExample;
import cn.cqut.bookmangement.util.PageHelper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@Mapper
public interface BookAdminMapper {
    long countByExample(BookAdminExample example);

    int deleteByPrimaryKey(String adid);

    int insert(BookAdmin record);

    int insertSelective(BookAdmin record);

    List<BookAdmin> selectByExample(BookAdminExample example);

    BookAdmin selectByPrimaryKey(String adid);

    int updateByPrimaryKeySelective(BookAdmin record);

    int updateByPrimaryKey(BookAdmin record);

    long countBySearch(@Param("content") String content);

    List<BookAdmin> selectBySearch(@Param("content") String content, @Param("example") PageHelper pageHelper);
}
package cn.cqut.bookmangement.mapper;

import cn.cqut.bookmangement.entity.BookInfo;
import cn.cqut.bookmangement.entity.BookInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper

public interface BookInfoMapper {
    long countByExample(BookInfoExample example);

    int deleteByPrimaryKey(String bookId);

    int insert(BookInfo record);

    int insertSelective(BookInfo record);

    List<BookInfo> selectByExample(BookInfoExample example);

    BookInfo selectByPrimaryKey(String bookId);

    int updateByPrimaryKeySelective(BookInfo record);

    int updateByPrimaryKey(BookInfo record);

    void updateStateToReced(String bookId);

    void updateStateToUnReced(String bookId);

    Integer countBySearch(@Param("content") String content);

    List<BookInfo> selectBySearch(@Param("content") String content, @Param("example")BookInfoExample bookInfoExample);

    Integer countBySearchByBookName(@Param("content") String content);

    List<Map> selectBySearchByBookName(@Param("content") String content, @Param("example") BookInfoExample bookInfoExample);
}
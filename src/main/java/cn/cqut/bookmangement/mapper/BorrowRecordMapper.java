package cn.cqut.bookmangement.mapper;

import cn.cqut.bookmangement.entity.BorrowRecord;
import cn.cqut.bookmangement.util.PageHelper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface BorrowRecordMapper {

    void insertRecord(BorrowRecord borrowRecord);

    int countBySearch(@Param("content") String content);

    List<Map> selectBySearch(@Param("content") String content, @Param("example") PageHelper pageHelper);

    BorrowRecord selectOneRecByUserAndBookId(BorrowRecord borrowRecord);

    void update(BorrowRecord borrowRecord);

    List<Map> selectRecByUserOnRec(@Param("userId") String userId);

    List<Map> selectUnRecByUserOnRec(@Param("userId")String userId);
}

package cn.cqut.bookmangement.service;

import cn.cqut.bookmangement.DTO.SearchContent;
import cn.cqut.bookmangement.entity.BorrowRecord;
import cn.cqut.bookmangement.entity.BorrowRecordExample;
import cn.cqut.bookmangement.entity.User;
import cn.cqut.bookmangement.mapper.BorrowRecordMapper;
import cn.cqut.bookmangement.util.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BorrowRecordService {
    @Autowired
    BorrowRecordMapper borrowRecordMapper;

    public void insertRecord(BorrowRecord borrowRecord) {
        borrowRecordMapper.insertRecord(borrowRecord);
    }

    public void updateRecordByPK(BorrowRecord borrowRecord) {
        borrowRecordMapper.update(borrowRecord);
    }

    public BorrowRecordExample searchRec(SearchContent searchContent) {
        if (StringUtils.isBlank(searchContent.getContent()))
            searchContent.setContent(null);
        BorrowRecordExample borrowRecordExample = new BorrowRecordExample();
        borrowRecordExample.setCurrentPage(searchContent.getCurrentPage());
        borrowRecordExample.setCount(borrowRecordMapper.countBySearch(searchContent.getContent()));
        System.out.println("start:" + borrowRecordExample.getStart());
        PageHelper.generateCheckedHelper(borrowRecordExample.getCount(), borrowRecordExample);
        borrowRecordExample.setData(borrowRecordMapper.selectBySearch(searchContent.getContent(), borrowRecordExample));
        /*
        bookAdminExample.clear();
        bookAdminExample.setCurrentPage(searchContent.getCurrentPage());
        bookAdminExample.setCount((int) bookAdminMapper.countBySearch(searchContent.getContent()));
        PageHelper.generateCheckedHelper(bookAdminExample.getCount(), bookAdminExample);
        bookAdminExample.setData(bookAdminMapper.selectBySearch(searchContent.getContent()));
        */
        return borrowRecordExample;
    }

    public BorrowRecord selectOneRecByUserAndBookId(BorrowRecord borrowRecord) {
        return borrowRecordMapper.selectOneRecByUserAndBookId(borrowRecord);
    }

    public List<Map> selectRecByUserOnRec(User tempUser) {
        return borrowRecordMapper.selectRecByUserOnRec(tempUser.getUserId());
    }

    public List<Map> selectUnRecByUserOnRec(User tempUser) {
        return borrowRecordMapper.selectUnRecByUserOnRec(tempUser.getUserId());
    }
}

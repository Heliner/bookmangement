package cn.cqut.bookmangement.service;

import cn.cqut.bookmangement.DTO.BorrowBookDTO;
import cn.cqut.bookmangement.DTO.SearchContent;
import cn.cqut.bookmangement.entity.BookInfo;
import cn.cqut.bookmangement.entity.BookInfoExample;
import cn.cqut.bookmangement.entity.BorrowRecord;
import cn.cqut.bookmangement.entity.User;
import cn.cqut.bookmangement.exception.NullOrEmptyException;
import cn.cqut.bookmangement.mapper.BookInfoMapper;
import cn.cqut.bookmangement.util.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookInfoService {
    @Autowired
    BookInfoMapper bookInfoMapper;
    @Autowired
    UserService userService;
    @Autowired
    BorrowRecordService borrowRecordService;

    public BorrowRecord bookInLab(BorrowBookDTO bookInfo) {
        if (bookInfo == null || bookInfo.getBookId() == null || bookInfo.getUserId() == null)
            throw new NullOrEmptyException("图书号借阅号不能为空");
        User user = userService.selectPK(bookInfo.getUserId());
        if (user == null)
            throw new NullOrEmptyException("用户不存在");
        if (user.getLendedNum() - user.getMax() > bookInfo.borrowNum)
            throw new NullOrEmptyException("已达到最大借阅数量");
        BookInfo res = bookInfoMapper.selectByPrimaryKey(bookInfo.getBookId());
        if (res == null || res.getState() != 1)
            throw new NullOrEmptyException("图书不存在或已被借出");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(System.currentTimeMillis())); //需要将date数据转移到Calender对象中操作
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.add(calendar.DATE, user.getMax());

        BorrowRecord borrowRecord = new BorrowRecord();
        BeanUtils.copyProperties(res, borrowRecord);
        borrowRecord.setUserId(user.getUserId());
        borrowRecord.setShouldTime(calendar.getTime());
        return borrowRecord;

    }

    public void borrowBook(Set<BorrowRecord> borrowRecords) {
        //1、修改书籍状态
        //2、插入借阅记录
        if (borrowRecords == null || borrowRecords.size() == 0)
            throw new NullOrEmptyException("图书列表为空");
        Iterator<BorrowRecord> iterator = borrowRecords.iterator();
        String userPK = iterator.next().getUserId();

        for (BorrowRecord borrowRecord : borrowRecords) {
            bookInfoMapper.updateStateToReced(borrowRecord.getBookId());
            borrowRecordService.insertRecord(borrowRecord);
        }
        User user = new User();
        user.setUserId(userPK);
        user = userService.getOneByPk(user);
        user.setLendedNum(user.getLendedNum() + borrowRecords.size());
        userService.updateSelective(user);
    }

    public void returnBook(BorrowRecord borrowRecord) {
        //1、修改书籍状态
        //2、更新借阅记录
        //3、修改借书人信息
        User user = new User();
        BeanUtils.copyProperties(borrowRecord, user);
        user = userService.selectPK(user.getUserId());

        user.setLendedNum(user.getLendedNum() - 1);
        userService.updateSelective(user);
        bookInfoMapper.updateStateToUnReced(borrowRecord.getBookId());

        borrowRecord = borrowRecordService.selectOneRecByUserAndBookId(borrowRecord);
        if (borrowRecord==null||borrowRecord.getReturnTime() != null)
            throw new NullOrEmptyException("图书已归还");

        borrowRecord.setReturnTime(new java.util.Date(System.currentTimeMillis()));
        borrowRecordService.updateRecordByPK(borrowRecord);

        if (borrowRecord.getReturnTime().after(borrowRecord.getShouldTime()))
            throw new NullOrEmptyException("图书超期，请到前台缴纳");

    }

    public String generatePK() {
        String uuid = UUID.randomUUID().toString();
        while (null != bookInfoMapper.selectByPrimaryKey(uuid)) {
            uuid = UUID.randomUUID().toString();
        }
        return uuid;
    }

    public void insertBookSelective(BookInfo bookInfo) {
        bookInfo.setEnteringDate(new Date());
        bookInfoMapper.insertSelective(bookInfo);
    }

    public BookInfo selectBookPK(BookInfo bookInfo) {
        return bookInfoMapper.selectByPrimaryKey(bookInfo.getBookId());
    }

    public void deleteByPK(BookInfo bookInfo) {
        bookInfoMapper.deleteByPrimaryKey(bookInfo.getBookId());
    }

    public void update(BookInfo bookInfo) {
        bookInfoMapper.updateByPrimaryKeySelective(bookInfo);
    }

    public BookInfoExample selectBookPage(SearchContent searchContent) {
        BookInfoExample bookInfoExample = new BookInfoExample();
        if (StringUtils.isBlank(searchContent.getContent()))
            searchContent.setContent(null);
        bookInfoExample.setCurrentPage(searchContent.getCurrentPage());
        bookInfoExample.setCount(bookInfoMapper.countBySearch(searchContent.getContent()));
        PageHelper.generateCheckedHelper(bookInfoExample.getCount(), bookInfoExample);
        bookInfoExample.setData(bookInfoMapper.selectBySearch(searchContent.getContent(), bookInfoExample));
        return bookInfoExample;
    }

    public BookInfoExample selectBookPGByBookName(SearchContent searchContent) {
        BookInfoExample bookInfoExample = new BookInfoExample();
        if (StringUtils.isBlank(searchContent.getContent()))
            searchContent.setContent(null);
        bookInfoExample.setCurrentPage(searchContent.getCurrentPage());
        bookInfoExample.setCount(bookInfoMapper.countBySearchByBookName(searchContent.getContent()));
        PageHelper.generateCheckedHelper(bookInfoExample.getCount(), bookInfoExample);
        bookInfoExample.setData(bookInfoMapper.selectBySearchByBookName(searchContent.getContent(), bookInfoExample));
        return bookInfoExample;

    }
}

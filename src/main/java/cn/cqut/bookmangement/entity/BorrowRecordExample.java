package cn.cqut.bookmangement.entity;

import cn.cqut.bookmangement.util.PageHelper;
import lombok.Data;

import java.util.Date;

@Data
public class BorrowRecordExample extends PageHelper {
    private Integer borrowId;
    private String userId;
    private String bookId;
    private Date shouldTime;
    private Date returnTime;
    private String bookName;
}

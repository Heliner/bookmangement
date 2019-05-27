
package cn.cqut.bookmangement.entity;
import lombok.Data;

import java.util.Date;

@Data
public class BorrowRecord {
    private Integer borrowId;
    private String userId;
    private String bookId;
    private Date shouldTime;
    private Date returnTime;
    private String bookName;
}

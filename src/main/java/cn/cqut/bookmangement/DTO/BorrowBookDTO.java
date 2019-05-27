package cn.cqut.bookmangement.DTO;

import lombok.Data;

@Data
public class BorrowBookDTO {
    public String userId;
    public String bookId;
    public Integer borrowNum;
}

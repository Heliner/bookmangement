package cn.cqut.bookmangement.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SysAdminCenterDTO {
    private String adminid;

    private String adminname;

    private String adminpassword;

    private String adminnpassword;

    private String admincpassword;

    private String adminphone;

    private String adminemail;


}
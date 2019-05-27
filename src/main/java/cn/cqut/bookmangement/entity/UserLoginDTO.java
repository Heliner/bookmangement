package cn.cqut.bookmangement.entity;

import lombok.Data;

@Data
public class UserLoginDTO {
    private String userId;

    private String userName;

    private String password;

    private Integer role;
}

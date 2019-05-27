package cn.cqut.bookmangement.entity;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;


@Getter
@Setter
public class Hello {
    @NotBlank
    String cont ;
}

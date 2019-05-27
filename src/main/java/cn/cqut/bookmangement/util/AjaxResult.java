package cn.cqut.bookmangement.util;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
@Data
public class AjaxResult<T> implements Serializable {
    private T data = null;
    private String url = null;
    private String message = null;
    private short resultCode;



}

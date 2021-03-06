package cn.cqut.bookmangement.exception;


import cn.cqut.bookmangement.util.AjaxResult;
import cn.cqut.bookmangement.util.ResultGenerator;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NullOrEmptyException.class)
    @ResponseBody
    public AjaxResult hanleNull(HttpServletRequest request, Exception exception) throws Exception {
        System.out.println(String.format("接受到来自request: %s 的错误请求  , message: %s , localizedMessage : %s", request.getRequestURI(), exception.getMessage(), exception.getLocalizedMessage()));
        exception.printStackTrace();
        return ResultGenerator.GENERATE_FAILED_MESSAGE(exception.getMessage());
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public AjaxResult hanleNullP(HttpServletRequest request, Exception exception) throws Exception {
        System.out.println(String.format("接受到来自request: %s 的错误请求  , message: %s , localizedMessage : %s", request.getRequestURI(), exception.getMessage(), exception.getLocalizedMessage()));
        exception.printStackTrace();
        return ResultGenerator.GENERATE_FAILED_MESSAGE("参数不能为空");
    }

    @ExceptionHandler(SQLException.class)
    @ResponseBody
    public AjaxResult handlePK(HttpServletRequest request, Exception exception) throws Exception {
        System.out.println(String.format("错误请求：MySQL异常，接受到来自request: %s 的错误请求  , message: %s , localizedMessage : %s", request.getRequestURI(), exception.getMessage(), exception.getLocalizedMessage()));
        exception.printStackTrace();
        return ResultGenerator.GENERATE_FAILED_MESSAGE("id不能重复");
    }

    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    @ResponseBody
    public AjaxResult exceptionHandler(HttpServletRequest request, Exception exception) throws Exception {
        System.out.println(String.format("接受到来自request: %s 的错误请求  , message: %s , localizedMessage : %s", request.getRequestURI(), exception.getMessage(), exception.getLocalizedMessage()));
        exception.printStackTrace();
        return ResultGenerator.GENERATE_FAILED_MESSAGE(exception.getMessage());
    }

    public ErrorMessage<String> hanleMethodArguementNotValidException(HttpServletRequest
                                                                              request, MethodArgumentNotValidException m) {
        m.printStackTrace();
        BindingResult bindingResult = m.getBindingResult();
        String errorMessage = bindingResult.getFieldError().getDefaultMessage();
        return handleErrorInfo(request, errorMessage, m);
    }

    private ErrorMessage<String> handleErrorInfo(HttpServletRequest request, String message, Exception exception) {
        exception.printStackTrace();
        ErrorMessage<String> errorMessage = new ErrorMessage<>();
        errorMessage.setMessage(message);
        errorMessage.setCode(ErrorMessage.ERROR);
        errorMessage.setData(message);
        errorMessage.setUrl(request.getRequestURL().toString());
        return errorMessage;
    }
}

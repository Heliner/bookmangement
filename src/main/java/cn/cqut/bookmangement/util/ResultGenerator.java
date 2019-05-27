package cn.cqut.bookmangement.util;

public class ResultGenerator {
    private static final short OPERATION_SUCCESS = 0;
    private static final short OPERATION_FAILED = 100;
    private static final String FAILED_MESSAGE = "UNKNOWN_FAILED";
    private static final String SUCCESS_MESSAGE = "SUCCESS";

    public static AjaxResult GENERATE_SUCCESS_RESULT() {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setData(null);
        ajaxResult.setResultCode(OPERATION_SUCCESS);
        return ajaxResult;
    }

    /**
     * 成功并返回内容
     * @param object
     * @return
     */
    public static AjaxResult GENERATE_SUCCESS_RESULT(Object object) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setResultCode(OPERATION_SUCCESS);
        ajaxResult.setData(object);
        return ajaxResult;
    }

//    public static AjaxResult GENERATE_SUCCESS_RESULT(String message) {
//        AjaxResult ajaxResult = new AjaxResult();
//        ajaxResult.setData(null);
//        ajaxResult.setResultCode(OPERATION_SUCCESS);
//        ajaxResult.setMessage(message);
//        return ajaxResult;
//    }

    public static AjaxResult GENERATE_SUCCESS_RESULT(String message, String url) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setMessage(message);
        ajaxResult.setResultCode(OPERATION_SUCCESS);
        ajaxResult.setUrl(url);
        return ajaxResult;
    }

    public static AjaxResult GENERATE_SUCCESS_RESULT(Object object, String url, String message) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setData(object);
        ajaxResult.setResultCode(OPERATION_SUCCESS);
        ajaxResult.setUrl(url);
        ajaxResult.setMessage(message);
        return ajaxResult;
    }

    /**
     * 生成错误信息
     *
     * @param message
     * @return
     */
    public static AjaxResult GENERATE_FAILED_MESSAGE(String message) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setResultCode(OPERATION_FAILED);
        ajaxResult.setMessage(message);
        return ajaxResult;
    }

    public static AjaxResult GENERATE_DEFAULT_FAILED_MESSAGE() {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setMessage(FAILED_MESSAGE);
        ajaxResult.setResultCode(OPERATION_FAILED);
        return ajaxResult;
    }

    public static AjaxResult GENERATE_SUCCESS_MESSAGE(String message) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setMessage(message);
        return ajaxResult;
    }

}

package cn.mangowork.shop.utils;

/**
 * 返回的参数封装类
 * Created by Donghua.Chen on 2018/4/20.
 */
public class ApiResponse <T> {

    private static final String CODE_SUCCESS = "success";

    private static final String CODE_FAIL = "fail";

    private String code;
    private T data;
    private String msg;

    public ApiResponse(){

    }

    public ApiResponse(String code){
        this.code = code;
    }

    public ApiResponse(String code, T data){
        this.code = code;
        this.data = data;
    }

    public ApiResponse(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public static ApiResponse success(){
        return new ApiResponse(CODE_SUCCESS);
    }

    public static ApiResponse success(Object data){
        return new ApiResponse(CODE_SUCCESS, data);
    }

    public static ApiResponse fail(String msg){
        return new ApiResponse(CODE_FAIL, msg);
    }

    public static ApiResponse widthCode(String errorCode) {
        return new ApiResponse(errorCode);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

package cn.mangowork.shop.utils;

import cn.mangowork.shop.constant.enums.HttpStatus;

/**
 * 返回的参数封装类
 * Created by Donghua.Chen on 2018/4/20.
 */
public class ApiResponse <T> {

    private static final String CODE_SUCCESS = "success";

    private static final String CODE_FAIL = "fail";

    private int status;

    private String code;

    private T data;
    private String msg;

    public ApiResponse(){

    }

    public ApiResponse(String code){
        this.code = code;
    }

    private ApiResponse(HttpStatus httpStatus){
        this.status = HttpStatus.getStatus(httpStatus);
        this.msg = HttpStatus.getDesc(httpStatus);
    }

    public ApiResponse(String code, T data){
        this.code = code;
        this.data = data;
    }

    private ApiResponse(HttpStatus httpStatus, T data){
        this.status = HttpStatus.getStatus(httpStatus);
        this.code = HttpStatus.getCode(httpStatus);
        if (data instanceof String){
            this.msg = (String) data;
        }else {
            this.data = data;
            this.msg = HttpStatus.getDesc(httpStatus);
        }

    }

    public ApiResponse(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    private ApiResponse(HttpStatus httpStatus, String msg){
        this.code = HttpStatus.getCode(httpStatus);
        this.status = HttpStatus.getStatus(httpStatus);
        this.msg = msg;
    }

    @Deprecated
    public static ApiResponse success(){
        return new ApiResponse(HttpStatus.getCode(HttpStatus.SUCCESS));
    }

    public static ApiResponse widthSuccess(){
        return new ApiResponse(HttpStatus.SUCCESS);
    }

    @Deprecated
    public static ApiResponse success(Object data){
        return new ApiResponse(CODE_SUCCESS, data);
    }

    public static ApiResponse widthSuccess(Object data){
        return new ApiResponse(HttpStatus.SUCCESS, data);
    }

    @Deprecated
    public static ApiResponse fail(String msg){
        return new ApiResponse(CODE_FAIL, msg);
    }

    public static ApiResponse widthFail(String msg){
        return new ApiResponse(HttpStatus.FAIL, msg);
    }

    @Deprecated
    public static ApiResponse widthCode(String errorCode) {
        return new ApiResponse(errorCode);
    }

    public static ApiResponse widthStatus(HttpStatus httpStatus) {
        return new ApiResponse(httpStatus);
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

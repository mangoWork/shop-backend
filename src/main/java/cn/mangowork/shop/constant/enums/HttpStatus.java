package cn.mangowork.shop.constant.enums;


/**
 * @author dailiming
 * @version v1
 * http状态码
 * @create 2018-11-14 19:27
 **/

public enum  HttpStatus {

    SUCCESS,
    SUCCESS_DESC(200,  "成功", SUCCESS, "success"),

    FAIL,
    FAIL_DESC(500,  "失败", FAIL, "fail"),

    NOT_FOUND,
    NOT_FOUND_DESC(404,  "未找到", FAIL, "notFound");

    private Integer status;

    private String desc = "";

    private HttpStatus statusEnum;

    private String code;



    HttpStatus(){
    }

    HttpStatus(final Integer status){
        this.status = status;
    }

    HttpStatus(final Integer status,final String desc, final HttpStatus statusEnum, String code){
        this.status = status;
        this.desc = desc;
        this.statusEnum = statusEnum;
        this.code = code;
    }


    /**
     * 根据枚举类型获取对应的status状态码
     * @param status
     * @return
     */
    public static Integer getStatus(HttpStatus status) {
        HttpStatus[] StatusEnums = HttpStatus.values();
        for (HttpStatus statusEnum : StatusEnums) {
            if (statusEnum.statusEnum == status) {
                return statusEnum.status();
            }
        }
        return null;
    }

    /**
     * 根据状态获取描述
     * @param status
     * @return
     */
    public static String getDesc(HttpStatus status) {
        HttpStatus[] statusEnums = HttpStatus.values();
        for (HttpStatus statusEnum : statusEnums) {
            if (statusEnum.statusEnum == status) {
                return statusEnum.desc();
            }
        }
        return null;
    }

    /**
     * 根据状态获取描述
     * @param value
     * @return
     */
    public static Integer getStatus(Integer value) {
        HttpStatus[] statusEnums = HttpStatus.values();
        for (HttpStatus statusEnum : statusEnums) {
            if (statusEnum.status == value) {
                return statusEnum.status;
            }
        }
        return null;
    }


    /**
     * 根据状态获取描述
     * @return
     */
    public static String getCode(HttpStatus status) {
        HttpStatus[] statusEnums = HttpStatus.values();
        for (HttpStatus statusEnum : statusEnums) {
            if (statusEnum.statusEnum == status) {
                return statusEnum.code;
            }
        }
        return null;
    }

    public Integer status(){
        return this.status;
    }

    public String desc(){
        return this.desc;
    }


    public HttpStatus statusEnum(){
        return this.statusEnum;
    }



}

package cn.mangowork.shop.constant.enums;

/**
 * @author dailiming
 * @version v1
 * 适配设备枚举
 * @create 2018-11-15 12:52
 **/

public enum  AdapterEnum {

    WX_PROGRAMMER,
    WX_PROGRAMMER_DESC(1,  "小程序", WX_PROGRAMMER, "wx-programmer"),

    WX_PUBLIC,
    FAIL_DESC(2,  "公众号", WX_PUBLIC, "wx-public"),

    PC,
    PC_DESC(3,  "PC", PC, "pc"),

    SITE,
    SITE_DESC(4,  "本站站点", SITE, "site");

    private Integer status;

    private String desc = "";

    private AdapterEnum statusEnum;

    private String code;



    AdapterEnum(){
    }

    AdapterEnum(final Integer status){
        this.status = status;
    }

    AdapterEnum(final Integer status,final String desc, final AdapterEnum statusEnum, String code){
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
    public static Integer getStatus(AdapterEnum status) {
        AdapterEnum[] StatusEnums = values();
        for (AdapterEnum statusEnum : StatusEnums) {
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
    public static String getDesc(AdapterEnum status) {
        AdapterEnum[] statusEnums = values();
        for (AdapterEnum statusEnum : statusEnums) {
            if (statusEnum.statusEnum == status) {
                return statusEnum.desc();
            }
        }
        return null;
    }

    /**
     * 根据状态获取描述
     * @param code
     * @return
     */
    public static String getDesc(String code) {
        AdapterEnum[] statusEnums = values();
        for (AdapterEnum statusEnum : statusEnums) {
            if (statusEnum.code != null && statusEnum.code.equals(code)) {
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
        AdapterEnum[] statusEnums = values();
        for (AdapterEnum statusEnum : statusEnums) {
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
    public static String getCode(AdapterEnum status) {
        AdapterEnum[] statusEnums = values();
        for (AdapterEnum statusEnum : statusEnums) {
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


    public AdapterEnum statusEnum(){
        return this.statusEnum;
    }



}

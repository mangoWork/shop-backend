package cn.mangowork.shop.constant;

/**
 * 基本状态枚举类型
 * @author Administrator
 */
public enum StatusEnum {

    DELETE,
    DELETE_DESC(1,  "删除", DELETE),

    ADD,
    ADD_DESC(1,  "添加", DELETE),

    NORMAL,
    NORMAL_DESC(0,"普通无状态", NORMAL);

    private Integer status;

    private String desc = "";

    private StatusEnum statusEnum;

    StatusEnum(){
    }

    StatusEnum(final Integer status){
        this.status = status;
    }

    StatusEnum(final Integer status,final String desc, final StatusEnum statusEnum){
        this.status = status;
        this.desc = desc;
        this.statusEnum = statusEnum;
    }


    /**
     * 根据枚举类型获取对应的status状态码
     * @param status
     * @return
     */
    public static Integer getStatu(StatusEnum status) {
        StatusEnum[] StatusEnums = StatusEnum.values();
        for (StatusEnum statusEnum : StatusEnums) {
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
    public static String getDesc(StatusEnum status) {
        StatusEnum[] statusEnums = StatusEnum.values();
        for (StatusEnum statusEnum : statusEnums) {
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
        StatusEnum[] statusEnums = StatusEnum.values();
        for (StatusEnum statusEnum : statusEnums) {
            if (statusEnum.status == value) {
                return statusEnum.status;
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


    public StatusEnum statusEnum(){
        return this.statusEnum;
    }


}
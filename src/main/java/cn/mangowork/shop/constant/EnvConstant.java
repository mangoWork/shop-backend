package cn.mangowork.shop.constant;

/**
 * @author dailiming
 * @version v1
 * 环境中的常量
 * @create 2018-11-13 19:34
 **/

public class EnvConstant {

    /**class文件对应的路径*/
    public static final String BASE_PATH = EnvConstant.class.getResource("/").getPath();

    /**时间格式date*/
    public static final String DATE_FORMAT = "yyyy-mm-dd";

    /**datetime日期格式*/
    public static final String DATETIME_FORMAT = "yyyy-mm-dd HH:mm:ss";

}

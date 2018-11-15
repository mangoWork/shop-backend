package cn.mangowork.shop.model;

/**
 * @author dailiming
 * @version v1
 * 系统配置
 * @create 2018-11-13 19:14
 **/

public class SettingDomain extends BaseDomain{

    private String key;

    private String value;

    private String type;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

package cn.mangowork.shop.model;

/**
 * @author dailiming
 * @version v1
 * 广告实体
 * @create 2018-11-13 19:14
 **/

public class BaseDomain {


    /**
     * 创建id
     */
    private String id;


    /**
     * 创建时间
     */
    private String created;

    /**
     * 更新时间
     */
    private String update;

    /**
     * 创建用户
     */
    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

package cn.mangowork.shop.model;

import java.util.Date;

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
    private int id;


    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date update;

    /**
     * 创建用户
     */
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

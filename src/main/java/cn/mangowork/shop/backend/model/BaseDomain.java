package cn.mangowork.shop.backend.model;

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
    protected int id;


    /**
     * 创建时间
     */
    protected Date created;

    /**
     * 更新时间
     */
    protected Date update;

    /**
     * 创建用户
     */
    protected int userId;

    /**
     * 状态
     * -1 删除
     */
    protected int status;

    /**
     * 乐观锁
     */
    protected int version;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}

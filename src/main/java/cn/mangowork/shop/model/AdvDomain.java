package cn.mangowork.shop.model;

import java.util.Date;

/**
 * @author dailiming
 * @version v1
 * 广告实体
 * @create 2018-11-13 19:14
 **/

public class AdvDomain extends BaseDomain{

    /**
     * 广告名
     */
    private String advName;

    /**
     * 是否跳转
     */
    private boolean jump;

    /**
     * 图片链接
     */
    private String advLink;

    /**
     * 图片路径
     */
    private String imgPath;

    /**
     * 适配
     */
    private String adapter;

    /**
     * 开始时间
     */
    private Date startDate;

    /**
     * 结束时间
     */
    private Date endDate;

    /**
     * 排序
     */
    private int sort;

    public String getAdvName() {
        return advName;
    }

    public void setAdvName(String advName) {
        this.advName = advName;
    }

    public boolean isJump() {
        return jump;
    }

    public void setJump(boolean jump) {
        this.jump = jump;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getAdapter() {
        return adapter;
    }

    public void setAdapter(String adapter) {
        this.adapter = adapter;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getAdvLink() {
        return advLink;
    }

    public void setAdvLink(String advLink) {
        this.advLink = advLink;
    }
}

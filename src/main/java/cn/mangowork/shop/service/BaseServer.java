package cn.mangowork.shop.service;


import cn.mangowork.shop.model.AdvDomain;

/**
 * 基本的服务
 */

public interface BaseServer {


    /**
     * 通过id删除
     * @param advDomain
     */
    void deleteById(AdvDomain advDomain);

}

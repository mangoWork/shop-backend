package cn.mangowork.shop.backend.service;


import cn.mangowork.shop.backend.model.AdvDomain;

import java.util.List;

/**
 * 基本的服务
 */

public interface BaseServer<T> {


    /**
     * 通过id删除
     * @param advDomain
     */
    void deleteById(AdvDomain advDomain);

    List<T> query(int pageNum, int pageSize);
}

package cn.mangowork.shop.service.adv;

import cn.mangowork.shop.model.AdvDomain;

/**
 * @author dailiming
 * @version v1
 * 广告server
 * @create 2018-11-13 20:03
 **/

public interface AdvServer {

    /**
     * 图片的保存
     * @param path  图片对应的路径
     * @param advDomain adv实体对象
     * @return 保存的状态
     */
    boolean saveAdv(String path, AdvDomain advDomain);

}

package cn.mangowork.shop.service.adv.impl;

import cn.mangowork.shop.model.AdvDomain;
import cn.mangowork.shop.service.adv.AdvServer;

/**
 * @author dailiming
 * @version v1
 * @create 2018-11-13 20:05
 **/

public class AdvServerImpl implements AdvServer {



    @Override
    public boolean saveAdv(String path, AdvDomain advDomain) {
        if (path != null){
            advDomain.setImgPath(path);
        }
        return false;
    }
}

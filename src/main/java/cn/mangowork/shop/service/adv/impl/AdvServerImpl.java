package cn.mangowork.shop.service.adv.impl;

import cn.mangowork.shop.constant.enums.AdapterEnum;
import cn.mangowork.shop.constant.enums.StatusEnum;
import cn.mangowork.shop.dao.AdvDao;
import cn.mangowork.shop.model.AdvDomain;
import cn.mangowork.shop.service.adv.AdvServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author dailiming
 * @version v1
 * @create 2018-11-13 20:05
 **/

@Service
public class AdvServerImpl implements AdvServer {


    @Autowired
    private AdvDao advDao;

    @Override
    public boolean saveAdv(String path, AdvDomain advDomain) {
        boolean success = false;
        if (path != null){
            advDomain.setImgPath(path);
        }
        if (advDomain.getId() == 0){
            advDomain.setCreated(new Date());
            int i = advDao.addAdv(advDomain);
        }else {
            advDao.updateAdv(advDomain);
        }
        return success;
    }

    @Override
    public List<AdvDomain> queryAdvs() {
        List<AdvDomain> query = advDao.query();
        for (AdvDomain advDomain: query){
            advDomain.setAdapter(AdapterEnum.getDesc(advDomain.getAdapter()));
        }
        return  query;
    }

    @Override
    public void deleteById(AdvDomain advDomain) {
        advDomain.setStatus(StatusEnum.getStatu(StatusEnum.DELETE));
        advDao.deleteById(advDomain);
    }

}

package cn.mangowork.shop.service.adv.impl;

import cn.mangowork.shop.dao.AdvDao;
import cn.mangowork.shop.model.AdvDomain;
import cn.mangowork.shop.service.adv.AdvServer;
import org.apache.ibatis.type.JdbcType;
import org.joda.time.DateTime;
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
        return advDao.query();
    }

    @Override
    public void deleteById(int id) {
        advDao.deleteById(id);
    }
}

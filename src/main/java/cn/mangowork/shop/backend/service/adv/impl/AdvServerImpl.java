package cn.mangowork.shop.backend.service.adv.impl;

import cn.mangowork.shop.constant.enums.AdapterEnum;
import cn.mangowork.shop.constant.enums.StatusEnum;
import cn.mangowork.shop.dao.AdvDao;
import cn.mangowork.shop.backend.model.AdvDomain;
import cn.mangowork.shop.backend.service.adv.AdvServer;
import com.github.pagehelper.PageHelper;
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
        return null;
    }

    public List<AdvDomain> queryAdvs(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<AdvDomain> query = advDao.query(new AdvDomain());
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

    @Override
    public List<AdvDomain> query(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        AdvDomain advDomain1 = new AdvDomain();
        List<AdvDomain> query = advDao.query(advDomain1);
        for (AdvDomain advDomain: query){
            advDomain.setAdapter(AdapterEnum.getDesc(advDomain.getAdapter()));
        }
        return query;
    }

}

package cn.mangowork.shop.dao;

import cn.mangowork.shop.model.AdvDomain;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 */

@Mapper
public interface AdvDao extends BaseDao<AdvDomain>{

    /**
     * 保存广告信息
     * @param advDomain
     * @return
     */
    int addAdv(AdvDomain advDomain);

    /**
     * 更新广告信息
     * @param advDomain
     */
    void updateAdv(AdvDomain advDomain);
}

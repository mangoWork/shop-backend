package cn.mangowork.shop.dao;

import cn.mangowork.shop.model.AdvDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Administrator
 */

@Mapper
public interface BaseDao<T> {

    /**
     * 添加数据
     * @param t
     * @return
     */
    int add(T t);

    /**
     * 更新数据
     * @param t
     */
    void update(T t);


    /**
     * 数据
     * @return
     */
    List<T>  query();

    /**
     * 通过id删除数据
     * @param advDomain
     */
    void deleteById(AdvDomain advDomain);
}

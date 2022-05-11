package com.ruoyi.project.system.goods.service;

import java.util.List;
import com.ruoyi.project.system.goods.domain.TGoods;

/**
 * 车票Service接口
 * 
 * @author ruoyi
 * @date 2022-05-09
 */
public interface ITGoodsService 
{
    /**
     * 查询车票
     * 
     * @param id 车票主键
     * @return 车票
     */
    public TGoods selectTGoodsById(Long id);

    /**
     * 查询车票列表
     * 
     * @param tGoods 车票
     * @return 车票集合
     */
    public List<TGoods> selectTGoodsList(TGoods tGoods);

    /**
     * 新增车票
     * 
     * @param tGoods 车票
     * @return 结果
     */
    public int insertTGoods(TGoods tGoods);

    /**
     * 修改车票
     * 
     * @param tGoods 车票
     * @return 结果
     */
    public int updateTGoods(TGoods tGoods);

    /**
     * 批量删除车票
     * 
     * @param ids 需要删除的车票主键集合
     * @return 结果
     */
    public int deleteTGoodsByIds(String ids);

    /**
     * 删除车票信息
     * 
     * @param id 车票主键
     * @return 结果
     */
    public int deleteTGoodsById(Long id);
}

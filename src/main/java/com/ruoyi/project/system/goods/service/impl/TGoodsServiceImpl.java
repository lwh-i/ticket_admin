package com.ruoyi.project.system.goods.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.goods.mapper.TGoodsMapper;
import com.ruoyi.project.system.goods.domain.TGoods;
import com.ruoyi.project.system.goods.service.ITGoodsService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 车票Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-09
 */
@Service
public class TGoodsServiceImpl implements ITGoodsService 
{
    @Autowired
    private TGoodsMapper tGoodsMapper;

    /**
     * 查询车票
     * 
     * @param id 车票主键
     * @return 车票
     */
    @Override
    public TGoods selectTGoodsById(Long id)
    {
        return tGoodsMapper.selectTGoodsById(id);
    }

    /**
     * 查询车票列表
     * 
     * @param tGoods 车票
     * @return 车票
     */
    @Override
    public List<TGoods> selectTGoodsList(TGoods tGoods)
    {
        return tGoodsMapper.selectTGoodsList(tGoods);
    }

    /**
     * 新增车票
     * 
     * @param tGoods 车票
     * @return 结果
     */
    @Override
    public int insertTGoods(TGoods tGoods)
    {
        return tGoodsMapper.insertTGoods(tGoods);
    }

    /**
     * 修改车票
     * 
     * @param tGoods 车票
     * @return 结果
     */
    @Override
    public int updateTGoods(TGoods tGoods)
    {
        return tGoodsMapper.updateTGoods(tGoods);
    }

    /**
     * 批量删除车票
     * 
     * @param ids 需要删除的车票主键
     * @return 结果
     */
    @Override
    public int deleteTGoodsByIds(String ids)
    {
        return tGoodsMapper.deleteTGoodsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除车票信息
     * 
     * @param id 车票主键
     * @return 结果
     */
    @Override
    public int deleteTGoodsById(Long id)
    {
        return tGoodsMapper.deleteTGoodsById(id);
    }
}

package com.ruoyi.project.system.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.customer.mapper.TcustomerMapper;
import com.ruoyi.project.system.customer.domain.Tcustomer;
import com.ruoyi.project.system.customer.service.ITcustomerService;
import com.ruoyi.common.utils.text.Convert;

/**
 * customerService业务层处理
 * 
 * @author lwh
 * @date 2022-05-09
 */
@Service
public class TcustomerServiceImpl implements ITcustomerService 
{
    @Autowired
    private TcustomerMapper tcustomerMapper;

    /**
     * 查询customer
     * 
     * @param id customer主键
     * @return customer
     */
    @Override
    public Tcustomer selectTcustomerById(Long id)
    {
        return tcustomerMapper.selectTcustomerById(id);
    }

    /**
     * 查询customer列表
     * 
     * @param tcustomer customer
     * @return customer
     */
    @Override
    public List<Tcustomer> selectTcustomerList(Tcustomer tcustomer)
    {
        return tcustomerMapper.selectTcustomerList(tcustomer);
    }

    /**
     * 新增customer
     * 
     * @param tcustomer customer
     * @return 结果
     */
    @Override
    public int insertTcustomer(Tcustomer tcustomer)
    {
        return tcustomerMapper.insertTcustomer(tcustomer);
    }

    /**
     * 修改customer
     * 
     * @param tcustomer customer
     * @return 结果
     */
    @Override
    public int updateTcustomer(Tcustomer tcustomer)
    {
        return tcustomerMapper.updateTcustomer(tcustomer);
    }

    /**
     * 批量删除customer
     * 
     * @param ids 需要删除的customer主键
     * @return 结果
     */
    @Override
    public int deleteTcustomerByIds(String ids)
    {
        return tcustomerMapper.deleteTcustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除customer信息
     * 
     * @param id customer主键
     * @return 结果
     */
    @Override
    public int deleteTcustomerById(Long id)
    {
        return tcustomerMapper.deleteTcustomerById(id);
    }
}

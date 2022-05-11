package com.ruoyi.project.system.customer.service;

import java.util.List;
import com.ruoyi.project.system.customer.domain.Tcustomer;

/**
 * customerService接口
 * 
 * @author lwh
 * @date 2022-05-09
 */
public interface ITcustomerService 
{
    /**
     * 查询customer
     * 
     * @param id customer主键
     * @return customer
     */
    public Tcustomer selectTcustomerById(Long id);

    /**
     * 查询customer列表
     * 
     * @param tcustomer customer
     * @return customer集合
     */
    public List<Tcustomer> selectTcustomerList(Tcustomer tcustomer);

    /**
     * 新增customer
     * 
     * @param tcustomer customer
     * @return 结果
     */
    public int insertTcustomer(Tcustomer tcustomer);

    /**
     * 修改customer
     * 
     * @param tcustomer customer
     * @return 结果
     */
    public int updateTcustomer(Tcustomer tcustomer);

    /**
     * 批量删除customer
     * 
     * @param ids 需要删除的customer主键集合
     * @return 结果
     */
    public int deleteTcustomerByIds(String ids);

    /**
     * 删除customer信息
     * 
     * @param id customer主键
     * @return 结果
     */
    public int deleteTcustomerById(Long id);
}

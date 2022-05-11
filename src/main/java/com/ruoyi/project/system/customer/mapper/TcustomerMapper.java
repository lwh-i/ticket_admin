package com.ruoyi.project.system.customer.mapper;

import java.util.List;
import com.ruoyi.project.system.customer.domain.Tcustomer;

/**
 * customerMapper接口
 * 
 * @author lwh
 * @date 2022-05-09
 */
public interface TcustomerMapper 
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
     * 删除customer
     * 
     * @param id customer主键
     * @return 结果
     */
    public int deleteTcustomerById(Long id);

    /**
     * 批量删除customer
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTcustomerByIds(String[] ids);
}

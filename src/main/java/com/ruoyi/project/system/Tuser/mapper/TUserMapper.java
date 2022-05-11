package com.ruoyi.project.system.Tuser.mapper;

import java.util.List;
import com.ruoyi.project.system.Tuser.domain.TUser;

/**
 * TuserMapper接口
 * 
 * @author ruoyi
 * @date 2022-05-09
 */
public interface TUserMapper 
{
    /**
     * 查询Tuser
     * 
     * @param id Tuser主键
     * @return Tuser
     */
    public TUser selectTUserById(Long id);

    /**
     * 查询Tuser列表
     * 
     * @param tUser Tuser
     * @return Tuser集合
     */
    public List<TUser> selectTUserList(TUser tUser);

    /**
     * 新增Tuser
     * 
     * @param tUser Tuser
     * @return 结果
     */
    public int insertTUser(TUser tUser);

    /**
     * 修改Tuser
     * 
     * @param tUser Tuser
     * @return 结果
     */
    public int updateTUser(TUser tUser);

    /**
     * 删除Tuser
     * 
     * @param id Tuser主键
     * @return 结果
     */
    public int deleteTUserById(Long id);

    /**
     * 批量删除Tuser
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTUserByIds(String[] ids);
}

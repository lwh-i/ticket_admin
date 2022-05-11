package com.ruoyi.project.system.Tuser.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.Tuser.mapper.TUserMapper;
import com.ruoyi.project.system.Tuser.domain.TUser;
import com.ruoyi.project.system.Tuser.service.ITUserService;
import com.ruoyi.common.utils.text.Convert;

/**
 * TuserService业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-09
 */
@Service
public class TUserServiceImpl implements ITUserService 
{
    @Autowired
    private TUserMapper tUserMapper;

    /**
     * 查询Tuser
     * 
     * @param id Tuser主键
     * @return Tuser
     */
    @Override
    public TUser selectTUserById(Long id)
    {
        return tUserMapper.selectTUserById(id);
    }

    /**
     * 查询Tuser列表
     * 
     * @param tUser Tuser
     * @return Tuser
     */
    @Override
    public List<TUser> selectTUserList(TUser tUser)
    {
        return tUserMapper.selectTUserList(tUser);
    }

    /**
     * 新增Tuser
     * 
     * @param tUser Tuser
     * @return 结果
     */
    @Override
    public int insertTUser(TUser tUser)
    {
        return tUserMapper.insertTUser(tUser);
    }

    /**
     * 修改Tuser
     * 
     * @param tUser Tuser
     * @return 结果
     */
    @Override
    public int updateTUser(TUser tUser)
    {
        return tUserMapper.updateTUser(tUser);
    }

    /**
     * 批量删除Tuser
     * 
     * @param ids 需要删除的Tuser主键
     * @return 结果
     */
    @Override
    public int deleteTUserByIds(String ids)
    {
        return tUserMapper.deleteTUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除Tuser信息
     * 
     * @param id Tuser主键
     * @return 结果
     */
    @Override
    public int deleteTUserById(Long id)
    {
        return tUserMapper.deleteTUserById(id);
    }
}

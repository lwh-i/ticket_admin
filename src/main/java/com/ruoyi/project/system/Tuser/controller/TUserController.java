package com.ruoyi.project.system.Tuser.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.Tuser.domain.TUser;
import com.ruoyi.project.system.Tuser.service.ITUserService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * TuserController
 * 
 * @author ruoyi
 * @date 2022-05-09
 */
@Controller
@RequestMapping("/system/Tuser")
public class TUserController extends BaseController
{
    private String prefix = "system/Tuser";

    @Autowired
    private ITUserService tUserService;

    @RequiresPermissions("system:Tuser:view")
    @GetMapping()
    public String Tuser()
    {
        return prefix + "/Tuser";
    }

    /**
     * 查询Tuser列表
     */
    @RequiresPermissions("system:Tuser:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TUser tUser)
    {
        startPage();
        List<TUser> list = tUserService.selectTUserList(tUser);
        return getDataTable(list);
    }

    /**
     * 导出Tuser列表
     */
    @RequiresPermissions("system:Tuser:export")
    @Log(title = "Tuser", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TUser tUser)
    {
        List<TUser> list = tUserService.selectTUserList(tUser);
        ExcelUtil<TUser> util = new ExcelUtil<TUser>(TUser.class);
        return util.exportExcel(list, "Tuser数据");
    }

    /**
     * 新增Tuser
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存Tuser
     */
    @RequiresPermissions("system:Tuser:add")
    @Log(title = "Tuser", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TUser tUser)
    {
        return toAjax(tUserService.insertTUser(tUser));
    }

    /**
     * 修改Tuser
     */
    @RequiresPermissions("system:Tuser:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TUser tUser = tUserService.selectTUserById(id);
        mmap.put("tUser", tUser);
        return prefix + "/edit";
    }

    /**
     * 修改保存Tuser
     */
    @RequiresPermissions("system:Tuser:edit")
    @Log(title = "Tuser", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TUser tUser)
    {
        return toAjax(tUserService.updateTUser(tUser));
    }

    /**
     * 删除Tuser
     */
    @RequiresPermissions("system:Tuser:remove")
    @Log(title = "Tuser", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tUserService.deleteTUserByIds(ids));
    }
}

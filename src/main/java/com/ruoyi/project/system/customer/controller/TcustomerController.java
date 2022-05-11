package com.ruoyi.project.system.customer.controller;

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
import com.ruoyi.project.system.customer.domain.Tcustomer;
import com.ruoyi.project.system.customer.service.ITcustomerService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * customerController
 * 
 * @author lwh
 * @date 2022-05-09
 */
@Controller
@RequestMapping("/system/customer")
public class TcustomerController extends BaseController
{
    private String prefix = "system/customer";

    @Autowired
    private ITcustomerService tcustomerService;

    @RequiresPermissions("system:customer:view")
    @GetMapping()
    public String customer()
    {
        return prefix + "/customer";
    }

    /**
     * 查询customer列表
     */
    @RequiresPermissions("system:customer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Tcustomer tcustomer)
    {
        startPage();
        List<Tcustomer> list = tcustomerService.selectTcustomerList(tcustomer);
        return getDataTable(list);
    }

    /**
     * 导出customer列表
     */
    @RequiresPermissions("system:customer:export")
    @Log(title = "customer", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Tcustomer tcustomer)
    {
        List<Tcustomer> list = tcustomerService.selectTcustomerList(tcustomer);
        ExcelUtil<Tcustomer> util = new ExcelUtil<Tcustomer>(Tcustomer.class);
        return util.exportExcel(list, "customer数据");
    }

    /**
     * 新增customer
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存customer
     */
    @RequiresPermissions("system:customer:add")
    @Log(title = "customer", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Tcustomer tcustomer)
    {
        return toAjax(tcustomerService.insertTcustomer(tcustomer));
    }

    /**
     * 修改customer
     */
    @RequiresPermissions("system:customer:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Tcustomer tcustomer = tcustomerService.selectTcustomerById(id);
        mmap.put("tcustomer", tcustomer);
        return prefix + "/edit";
    }

    /**
     * 修改保存customer
     */
    @RequiresPermissions("system:customer:edit")
    @Log(title = "customer", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Tcustomer tcustomer)
    {
        return toAjax(tcustomerService.updateTcustomer(tcustomer));
    }

    /**
     * 删除customer
     */
    @RequiresPermissions("system:customer:remove")
    @Log(title = "customer", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tcustomerService.deleteTcustomerByIds(ids));
    }
}

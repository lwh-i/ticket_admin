package com.ruoyi.project.system.goods.controller;

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
import com.ruoyi.project.system.goods.domain.TGoods;
import com.ruoyi.project.system.goods.service.ITGoodsService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 车票Controller
 * 
 * @author ruoyi
 * @date 2022-05-09
 */
@Controller
@RequestMapping("/system/goods")
public class TGoodsController extends BaseController
{
    private String prefix = "system/goods";

    @Autowired
    private ITGoodsService tGoodsService;

    @RequiresPermissions("system:goods:view")
    @GetMapping()
    public String goods()
    {
        return prefix + "/goods";
    }

    /**
     * 查询车票列表
     */
    @RequiresPermissions("system:goods:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TGoods tGoods)
    {
        startPage();
        List<TGoods> list = tGoodsService.selectTGoodsList(tGoods);
        return getDataTable(list);
    }

    /**
     * 导出车票列表
     */
    @RequiresPermissions("system:goods:export")
    @Log(title = "车票", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TGoods tGoods)
    {
        List<TGoods> list = tGoodsService.selectTGoodsList(tGoods);
        ExcelUtil<TGoods> util = new ExcelUtil<TGoods>(TGoods.class);
        return util.exportExcel(list, "车票数据");
    }

    /**
     * 新增车票
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存车票
     */
    @RequiresPermissions("system:goods:add")
    @Log(title = "车票", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TGoods tGoods)
    {
        return toAjax(tGoodsService.insertTGoods(tGoods));
    }

    /**
     * 修改车票
     */
    @RequiresPermissions("system:goods:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TGoods tGoods = tGoodsService.selectTGoodsById(id);
        mmap.put("tGoods", tGoods);
        return prefix + "/edit";
    }

    /**
     * 修改保存车票
     */
    @RequiresPermissions("system:goods:edit")
    @Log(title = "车票", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TGoods tGoods)
    {
        return toAjax(tGoodsService.updateTGoods(tGoods));
    }

    /**
     * 删除车票
     */
    @RequiresPermissions("system:goods:remove")
    @Log(title = "车票", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tGoodsService.deleteTGoodsByIds(ids));
    }
}

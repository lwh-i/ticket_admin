package com.ruoyi.project.system.goods.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 车票对象 t_goods
 * 
 * @author ruoyi
 * @date 2022-05-09
 */
public class TGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品id */
    private Long id;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String goodsName;

    /** 商品标题 */
    @Excel(name = "商品标题")
    private String goodsTitle;

    /** 商品图片 */
    @Excel(name = "商品图片")
    private String goodsImg;

    /** 商品介绍详情 */
    @Excel(name = "商品介绍详情")
    private String goodsDetail;

    /** 商品单价 */
    @Excel(name = "商品单价")
    private BigDecimal goodsPrice;

    /** 商品库存，-1表示没有限制 */
    @Excel(name = "商品库存，-1表示没有限制")
    private Long goodsStock;

    /** 注册时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "注册时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 最近一次登录 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最近一次登录", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateDate;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
    }

    public String getGoodsName()
    {
        return goodsName;
    }
    public void setGoodsTitle(String goodsTitle)
    {
        this.goodsTitle = goodsTitle;
    }

    public String getGoodsTitle()
    {
        return goodsTitle;
    }
    public void setGoodsImg(String goodsImg)
    {
        this.goodsImg = goodsImg;
    }

    public String getGoodsImg()
    {
        return goodsImg;
    }
    public void setGoodsDetail(String goodsDetail)
    {
        this.goodsDetail = goodsDetail;
    }

    public String getGoodsDetail()
    {
        return goodsDetail;
    }
    public void setGoodsPrice(BigDecimal goodsPrice)
    {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getGoodsPrice()
    {
        return goodsPrice;
    }
    public void setGoodsStock(Long goodsStock)
    {
        this.goodsStock = goodsStock;
    }

    public Long getGoodsStock()
    {
        return goodsStock;
    }
    public void setCreateDate(Date createDate)
    {
        this.createDate = createDate;
    }

    public Date getCreateDate()
    {
        return createDate;
    }
    public void setUpdateDate(Date updateDate)
    {
        this.updateDate = updateDate;
    }

    public Date getUpdateDate()
    {
        return updateDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("goodsName", getGoodsName())
            .append("goodsTitle", getGoodsTitle())
            .append("goodsImg", getGoodsImg())
            .append("goodsDetail", getGoodsDetail())
            .append("goodsPrice", getGoodsPrice())
            .append("goodsStock", getGoodsStock())
            .append("createDate", getCreateDate())
            .append("updateDate", getUpdateDate())
            .toString();
    }
}

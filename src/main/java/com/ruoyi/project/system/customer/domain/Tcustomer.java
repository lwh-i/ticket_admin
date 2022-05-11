package com.ruoyi.project.system.customer.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * customer对象 t_customer
 * 
 * @author lwh
 * @date 2022-05-09
 */
public class Tcustomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 用户名 */
    @Excel(name = "用户名")
    private String nickname;

    /** 手机号 */
    @Excel(name = "手机号")
    private Long phone;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** md的盐 */
    @Excel(name = "md的盐")
    private String slat;

    /** 头 */
    @Excel(name = "头")
    private String head;

    /** 登录次数 */
    @Excel(name = "登录次数")
    private Long loginCount;

    /** 注册时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "注册时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date registerDate;

    /** 最近一次登录 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最近一次登录", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastLoginDate;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public String getNickname()
    {
        return nickname;
    }
    public void setPhone(Long phone)
    {
        this.phone = phone;
    }

    public Long getPhone()
    {
        return phone;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }
    public void setSlat(String slat)
    {
        this.slat = slat;
    }

    public String getSlat()
    {
        return slat;
    }
    public void setHead(String head)
    {
        this.head = head;
    }

    public String getHead()
    {
        return head;
    }
    public void setLoginCount(Long loginCount)
    {
        this.loginCount = loginCount;
    }

    public Long getLoginCount()
    {
        return loginCount;
    }
    public void setRegisterDate(Date registerDate)
    {
        this.registerDate = registerDate;
    }

    public Date getRegisterDate()
    {
        return registerDate;
    }
    public void setLastLoginDate(Date lastLoginDate)
    {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastLoginDate()
    {
        return lastLoginDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("nickname", getNickname())
            .append("phone", getPhone())
            .append("password", getPassword())
            .append("slat", getSlat())
            .append("head", getHead())
            .append("loginCount", getLoginCount())
            .append("registerDate", getRegisterDate())
            .append("lastLoginDate", getLastLoginDate())
            .toString();
    }
}

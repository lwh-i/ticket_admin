package com.ruoyi.project.system.Tuser.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * Tuser对象 t_user
 * 
 * @author ruoyi
 * @date 2022-05-09
 */
public class TUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /**  */
    @Excel(name = "")
    private String nickname;

    /**  */
    @Excel(name = "")
    private Long phone;

    /**  */
    @Excel(name = "")
    private String password;

    /**  */
    @Excel(name = "")
    private String slat;

    /**  */
    @Excel(name = "")
    private String head;

    /**  */
    @Excel(name = "")
    private Long loginCount;

    /**  */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "", width = 30, dateFormat = "yyyy-MM-dd")
    private Date registerDate;

    /**  */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "", width = 30, dateFormat = "yyyy-MM-dd")
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

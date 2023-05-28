package com.huang.cn.dangdang.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(SysUser)实体类
 *
 * @author derek.huang
 * @since 2023-05-28 12:56:40
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = -55676605702198360L;
    /**
     * 用户编号
     */
    private String userId;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户昵称
     */
    private String loginName;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户手机
     */
    private String userMobile;
    /**
     * 用户邮箱
     */
    private String userEmail;
    /**
     * 用户性别(1-男;0-女)
     */
    private Integer userSex;
    /**
     * 用户年龄
     */
    private Integer userAge;
    /**
     * 用户生日
     */
    private Date userBirthday;
    /**
     * 用户地址
     */
    private String userAddress;
    /**
     * 状态(1-可用;0-不可用)
     */
    private Integer userState;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 用户身份证
     */
    private String userIdCard;
    /**
     * 用户类型(0-团体;1-个人;2-员工;3-客户)
     */
    private Integer userType;
    /**
     * 用户等级
     */
    private Integer userLevel;
    /**
     * 备注
     */
    private String userNote;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserIdCard() {
        return userIdCard;
    }

    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }

}


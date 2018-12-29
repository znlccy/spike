package com.znlccy.domain;

import lombok.Data;

/**
 * author: admin
 * date: 2018/12/28-20:46
 * version: 1.0.0
 * comment: 用户对象
 */
@Data
public class UserDomain {

    /**
     * 声明用户主键
     */
    private Integer id;

    /**
     * 声明用户姓名
     */
    private String name;

    /**
     * 声明用户性别
     */
    private Boolean gender;

    /**
     * 声明用户年龄
     */
    private Integer age;

    /**
     * 声明用户电话
     */
    private String telphone;

    /**
     * 声明用户注册模式
     */
    private String registerMode;

    /**
     * 声明第三方主键
     */
    private String thirdPartyId;

    /**
     * 声明加密方式
     */
    private String encryptPassword;

}

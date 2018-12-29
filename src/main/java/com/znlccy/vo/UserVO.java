package com.znlccy.vo;

import lombok.Data;

/**
 * author: admin
 * date: 2018/12/29-11:27
 * version: 1.0.0
 * comment: 用户显示层
 */

@Data
public class UserVO {

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

}

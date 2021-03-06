package com.znlccy.model;

import lombok.Data;

/**
 * author: admin
 * date: 2018/12/28-20:44
 * version: 1.0.0
 * comment: 用户密码
 */
@Data
public class UserPasswordDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_password.id
     *
     * @mbg.generated Fri Dec 28 17:23:34 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_password.encrypt_password
     *
     * @mbg.generated Fri Dec 28 17:23:34 CST 2018
     */
    private String encryptPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_password.user_id
     *
     * @mbg.generated Fri Dec 28 17:23:34 CST 2018
     */
    private Integer userId;
}
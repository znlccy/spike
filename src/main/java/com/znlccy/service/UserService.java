package com.znlccy.service;

import com.znlccy.domain.UserDomain;

/**
 * author: admin
 * date: 2018/12/28-17:18
 * version: 1.0.0
 * comment: 用户服务接口
 */
public interface UserService {

    UserDomain getUserById(Integer id);
}

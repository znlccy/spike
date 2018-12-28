package com.znlccy.service.impl;

import com.znlccy.mapper.UserDOMapper;
import com.znlccy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author: admin
 * date: 2018/12/28-17:36
 * version: 1.0.0
 * comment: 用户服务实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDOMapper userDOMapper;



}

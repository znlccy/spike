package com.znlccy.service.impl;

import com.znlccy.dto.UserDTO;
import com.znlccy.mapper.UserDOMapper;
import com.znlccy.mapper.UserPasswordDOMapper;
import com.znlccy.model.UserDO;
import com.znlccy.model.UserPasswordDO;
import com.znlccy.service.UserService;
import com.znlccy.domain.UserDomain;
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

    @Autowired
    private UserPasswordDOMapper userPasswordDOMapper;

    @Override
    public UserDomain getUserById(Integer id) {
        //调用userdomapper获取到对应的用户model
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        if (userDO == null) {
            return null;
        }
        //通过用户主键获取用户加密密码信息
        UserPasswordDO userPasswordDO = userPasswordDOMapper.selectByUserId(id);
        return UserDTO.convertFromModel(userDO, userPasswordDO);
    }
}

package com.znlccy.controller;

import com.znlccy.dto.UserDTO;
import com.znlccy.service.UserService;
import com.znlccy.domain.UserDomain;
import com.znlccy.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author: admin
 * date: 2018/12/28-17:18
 * version: 1.0.0
 * comment: 用户控制器
 */

@Controller("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public UserVO getUser(@RequestParam("id") Integer id) throws Exception {
        //调用service服务获取对应id的用户对象并返回给前端
        UserDomain userDomain = userService.getUserById(id);
        return UserDTO.convertFromDomain(userDomain);
    }
}

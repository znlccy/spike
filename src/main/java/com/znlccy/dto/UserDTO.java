package com.znlccy.dto;

import com.znlccy.model.UserDO;
import com.znlccy.model.UserPasswordDO;
import com.znlccy.domain.UserDomain;
import com.znlccy.vo.UserVO;
import org.springframework.beans.BeanUtils;

/**
 * author: admin
 * date: 2018/12/29-10:49
 * version: 1.0.0
 * comment: UserDo对象转换成User对象
 */
public class UserDTO {

    /**
     * 组装
     * @param userDO
     * @param userPasswordDO
     * @return
     */
    public static UserDomain convertFromModel(UserDO userDO, UserPasswordDO userPasswordDO) {
        UserDomain userDomain = new UserDomain();
        if (userDO == null) {
            return null;
        }
        BeanUtils.copyProperties(userDO, userDomain);
        userDomain.setEncryptPassword(userPasswordDO.getEncryptPassword());
        return userDomain;
    }

    /**
     * 转化
     * @param userDomain
     * @return
     */
    public static UserVO convertFromDomain(UserDomain userDomain) {
        UserVO userVO = new UserVO();
        if (userDomain == null) {
            return null;
        }
        BeanUtils.copyProperties(userDomain, userVO);
        return userVO;
    }
}

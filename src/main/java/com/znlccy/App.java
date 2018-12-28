package com.znlccy;

import com.znlccy.mapper.UserDOMapper;
import com.znlccy.model.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "com.znlccy")
@RestController
@MapperScan("com.znlccy.mapper")
public class App {

    @Autowired
    private UserDOMapper userDOMapper;

    public static void main( String[] args ) {
        SpringApplication.run(App.class);
    }

    @RequestMapping(value = "/")
    public String home() {

        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if (userDO == null) {
            return "用户对象不存在";
        } else {
            return userDO.getName();
        }
    }
}

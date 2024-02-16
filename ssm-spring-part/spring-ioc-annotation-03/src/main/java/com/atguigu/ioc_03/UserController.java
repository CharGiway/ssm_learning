package com.atguigu.ioc_03;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@Controller
public class UserController {
    @Resource
    private UserService userService;
    public String show(){
        return userService.show();
    }
}

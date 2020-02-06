package com.example.mall.user.controller;


import com.example.mall.user.bean.umsMember;
import com.example.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<umsMember> getAllUser(){
        List<umsMember> umsMember =userService.getAllUser();
        return  umsMember;
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index(){

        return  "Hello mall";
    }

}

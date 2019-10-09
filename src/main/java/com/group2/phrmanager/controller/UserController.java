package com.group2.phrmanager.controller;


import com.group2.phrmanager.entity.UserEntity;
import com.group2.phrmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping("/doLogin")
    @ResponseBody
    public boolean doLogin(String userName,String password){

        boolean result = userService.checkUserPwd(userName,password);
        return result;
    }

    @RequestMapping("/doRegist")
    public ModelAndView Regist(ModelAndView modelAndView,UserEntity userEntity){
        userService.saveUserInfo(userEntity);
        return modelAndView;
    }
}

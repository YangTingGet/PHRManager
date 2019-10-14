package com.group2.phrmanager.controller;


import com.group2.phrmanager.entity.UserEntity;
import com.group2.phrmanager.service.AdminService;
import com.group2.phrmanager.service.UserService;
import com.group2.phrmanager.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/user" ,method = RequestMethod.GET)
public class UserController {


    @Autowired
    UserService userService;
    @Autowired
    AdminService adminService;
    @Autowired
    HospitalService hospitalService;

    @RequestMapping("/doLogin")
    @ResponseBody
    public int doLogin(HttpServletRequest request, String userName, String password, String radio) {

        System.out.println(userName);
        System.out.println(password);
        System.out.println(radio);
        boolean result;
        if (radio.equals("option1")) {
            result = userService.checkUserPwd(userName, password);

            if (result) {
                request.getSession().setAttribute("userName",userName);
                return 1;
            }

        } else if (radio.equals("option2")) {
            result = adminService.checkAdminPwd(userName, password);
            if (result) {
                request.getSession().setAttribute("userName",userName);
                return 2;
            }

        } else if (radio.equals("option3")) {
            result = hospitalService.checkHospitalPwd(userName, password);

            if (result) {
                request.getSession().setAttribute("userName",userName);
                return 3;
            }
        } else return 0;

        return 0;
    }

    @RequestMapping("/docheckRegistName")
    @ResponseBody
    public boolean docheckRegistName(String userName){

        return userService.checkUserName(userName);
    }



    @RequestMapping("/do_checkUserName")
    @ResponseBody
    public boolean checkRegisterName(String userName){

        return userService.checkUserName(userName);

    }
    @RequestMapping("/doRegist")
    @ResponseBody
    public ModelAndView Regist(ModelAndView modelAndView, @RequestParam String registerUsername, @RequestParam String registerPassword, @RequestParam String registerEmail, UserEntity userEntity){
        userEntity.setUser_name(registerUsername);
        userEntity.setEmail(registerEmail);
        userEntity.setPassword(registerPassword);
        boolean result = userService.saveUserInfo(userEntity);

        if (result){
            modelAndView.addObject("userEntity",userEntity);
            modelAndView.setViewName("settingUp_user");
        }
        return modelAndView;

    }

    @RequestMapping("/doRevise")
    @ResponseBody
        public ModelAndView ReviseUserInfo(ModelAndView modelAndView,UserEntity userEntity){
            System.out.println(userEntity);
            if(userService.reviseUserInfo(userEntity)){
                modelAndView.addObject("userEntity",userEntity);
                modelAndView.setViewName("settingUp_user");
            }
            return modelAndView;
    }


}

package com.group2.phrmanager.controller;


import com.group2.phrmanager.entity.HospitalEntity;
import com.group2.phrmanager.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @RequestMapping("/doRevise")
    @ResponseBody
    public ModelAndView ReviseUserInfo(ModelAndView modelAndView, HospitalEntity hospitalEntity) {

        if (hospitalService.reviseHospitalInfo(hospitalEntity)) {
            modelAndView.addObject("hospitalEntity", hospitalEntity);
            modelAndView.setViewName("settingUp_hospital");
        }

        return modelAndView;
    }
}

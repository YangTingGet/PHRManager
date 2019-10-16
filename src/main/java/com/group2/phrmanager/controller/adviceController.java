package com.group2.phrmanager.controller;

import com.group2.phrmanager.entity.AdviceEntity;
import com.group2.phrmanager.service.AdviceService;
import com.group2.phrmanager.unti.Page;
import com.group2.phrmanager.vo.advicePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class adviceController {
    @Autowired
    AdviceService adviceService;

    @RequestMapping("/advice/adviceInfo")
    @ResponseBody
    public advicePage showAdvice(String pageNum){
        Page page = new Page();

        page.setPageNum(Integer.parseInt(pageNum));
        page.setPageSize(4);

        int count =adviceService.getAdviceCount();
        page.setTotalCount(count);

        List<AdviceEntity> advice=adviceService.getAllAdviceByPage(page);
        advicePage advicePage=new advicePage();

        advicePage.setAdvice(advice);
        advicePage.setPage(page);

        return advicePage;
    }

    @RequestMapping(value = "/advice/showAdviceDetails/{h_id}",method = RequestMethod.GET)
    public ModelAndView getAdviceDetails(ModelAndView modelAndView, @PathVariable("h_id") String h_id){
        AdviceEntity adviceEntity=adviceService.getAdviceDetails(h_id);
        modelAndView.addObject("advice",adviceEntity);
        modelAndView.setViewName("adviceDetail");
        return modelAndView;
    }

}

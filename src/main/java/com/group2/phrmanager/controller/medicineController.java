package com.group2.phrmanager.controller;

import com.group2.phrmanager.entity.MedicineEntity;
import com.group2.phrmanager.service.MedicineService;
import com.group2.phrmanager.unti.Page;
import com.group2.phrmanager.vo.medicinePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller

public class medicineController {
    @Autowired
    MedicineService medicineService;

    @RequestMapping("/medicine/medicineInfo")
    @ResponseBody
    public medicinePage showMedicine(String pageNum){
        Page page = new Page();

        page.setPageNum(Integer.parseInt(pageNum));
        page.setPageSize(6);

        int count =medicineService.getMedicineCount();
        page.setTotalCount(count);

        List<MedicineEntity> medicine=medicineService.getAllMedicineByPage(page);
        medicinePage medicinePage=new medicinePage();

        medicinePage.setMedicine(medicine);
        medicinePage.setPage(page);

        return medicinePage;
    }

    @RequestMapping(value = "/medicine/showMedDetails/{med_id}",method = RequestMethod.GET)
    public ModelAndView getMedDetails(ModelAndView modelAndView, @PathVariable("med_id") String med_id){
        MedicineEntity medicineEntity=medicineService.getMedicineDetails(med_id);
        modelAndView.addObject("medicine",medicineEntity);
        modelAndView.setViewName("medicineDetail");
        return modelAndView;
    }
}

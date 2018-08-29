package com.example.colordetails.controller;

import com.example.colordetails.service.CapacityService;
import com.example.colordetails.service.PackagesService;
import com.example.colordetails.service.WaterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TypeController {
    @Autowired
    private WaterTypeService waterTypeService;
    @Autowired
    private PackagesService packagesService;
    @Autowired
    private CapacityService capacityService;
    //查询所有的类型
    @GetMapping("findAllType")
    public String findAllType(Model WaterTypeModel, Model PackagesModel, Model CapacityModel){
        //添加从服务获取的三个类型的数据进入模型
        WaterTypeModel.addAttribute("WaterTypeModel",waterTypeService.getAllWaterType());
        PackagesModel.addAttribute("PackagesModel",packagesService.getAllWaterType());
        CapacityModel.addAttribute("CapacityModel",capacityService.getAllWaterType());
        return "AdminForType";
    }
}

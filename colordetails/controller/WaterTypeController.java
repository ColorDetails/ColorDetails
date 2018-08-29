package com.example.colordetails.controller;

import com.example.colordetails.entity.WaterTypeInfo;
import com.example.colordetails.service.WaterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//水类型控制器
@Controller
public class WaterTypeController {
    @Autowired
    private WaterTypeService waterTypeService;
    //修改和增加
    @PostMapping("updateWaterType")
    public String updateWaterType(WaterTypeInfo waterTypeInfo, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("msg1","添加成功！");
        waterTypeService.addWaterType(waterTypeInfo);
        return "redirect:/findAllType";
    }
    //根据id删除类型
    @GetMapping("deleteWaterTypeById/{id}")
    public String deleteWaterTypeById(@PathVariable Integer id){
        waterTypeService.deleteWaterTypeById(id);
        return "redirect:/findAllType";
    }
}

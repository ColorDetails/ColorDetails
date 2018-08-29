package com.example.colordetails.controller;

import com.example.colordetails.entity.CapacityTypeInfo;
import com.example.colordetails.service.CapacityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//单件容量
@Controller
public class CapacityController {
    @Autowired
    private CapacityService capacityService;
    //增加和修改
    @PostMapping("updateCapacityType")
    public String updateWaterType(CapacityTypeInfo capacityTypeInfo, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("msg2","添加成功！");
        capacityService.addWaterType(capacityTypeInfo);
        return "redirect:/findAllType";
    }
    //删除
    @GetMapping("deleteCapacityById/{id}")
    public String deleteCapacityById(@PathVariable Integer id){
        capacityService.deleteWaterTypeById(id);
        return "redirect:/findAllType";
    }
}

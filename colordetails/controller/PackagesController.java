package com.example.colordetails.controller;

import com.example.colordetails.entity.PackagesTypeInfo;
import com.example.colordetails.service.PackagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//包装件数
@Controller
public class PackagesController {
    @Autowired
    private PackagesService packagesService;
    //修改和增加
    @PostMapping("updatePackagesType")
    public String updateWaterType(PackagesTypeInfo packagesTypeInfo, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("msg3","添加成功！");
        packagesService.addWaterType(packagesTypeInfo);
        return "redirect:/findAllType";
    }
    //删除
    @GetMapping("deletePackagesTypeById/{id}")
    public String deletePackagesTypeById(@PathVariable Integer id){
        packagesService.deleteWaterTypeById(id);
        return "redirect:/findAllType";
    }

}

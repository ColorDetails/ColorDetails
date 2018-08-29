package com.example.colordetails.controller;
import com.example.colordetails.Util.FileUtil;
import com.example.colordetails.entity.CompanyInfo;
import com.example.colordetails.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
/**
 * Dragon Write
 */
@Controller
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    //管理员查询所有公司信息
    @GetMapping("findAllCompanyInfo")
    public String findCompanyAll(Model model){
        List<CompanyInfo> companyInfos=companyService.findAll();
        model.addAttribute("list",companyInfos);
        return "AdminForCompany";
    }
    //管理员增加公司信息
    @GetMapping("addCompanyInfo")
    public String addCompanyInfo(){
        return "CompanyAdd";
    }
    @PostMapping("addCompany")
    public String addCompany(CompanyInfo companyInfo, @RequestParam("file") MultipartFile file) {
        String contentType = file.getContentType();//定义图片文件类型
        String fileName = file.getOriginalFilename();//定义图片名字
        String filePath = FileUtil.getUpLoadFilePath();//文件路径，（绝对路径）
        fileName = System.currentTimeMillis() + fileName;//文件名，毫秒加原名
        try {
            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
//            e.printStackTrace();
        }
        companyInfo.setLogo(fileName);//重新设置图片名
        companyService.addCompanyInfo(companyInfo);
        return "redirect:/findAllCompanyInfo";
    }
    //管理员修改公司信息
    @GetMapping("/updateCompanyInfo/{id}")
    public String updateCompanyInfo(@PathVariable("id") Integer id,Model model){
        model.addAttribute("list",companyService.findCompanyInfoById(id));
        return "CompanyUpdate";
    }
    //根据id 删除公司信息
    @GetMapping("delelteCompanyInfoById/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        companyService.deleteById(id);
        return "redirect:/findAllCompanyInfo";
    }
}

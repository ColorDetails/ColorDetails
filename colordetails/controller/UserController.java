package com.example.colordetails.controller;

import com.example.colordetails.entity.User;
import com.example.colordetails.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("login")
    public String login(){
        return "login";
    }
    @PostMapping("login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        RedirectAttributes redirectAttributes){
        User user=userService.login(username,password);
        if (user==null){
            redirectAttributes.addFlashAttribute("msgError","用户名或者是密码错了！");
            return "redirect:/login";
        }
        if (user.getUser_Type().equals("0")){
            session.setAttribute("user",user);
            return "AdminIndex";
        }else if (user.getUser_Type().equals("1")){
            session.setAttribute("user",user);
            return "SellerIndex";
        }else if ((user.getUser_Type().equals("2"))){
            session.setAttribute("user",user);
            return "BrandIndex";
        }
        return "redirect:/login";
    }
    //注册界面
    @GetMapping("register")
    public String register(){
        return "Register";
    }
    //注册操作
    @PostMapping("register")
    public String register(User user){
        userService.register(user);
        return "redirect:/login";
    }

}

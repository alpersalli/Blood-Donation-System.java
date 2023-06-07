package com.Blood_Donation_System.Blood_Donation_System.controller;

import com.Blood_Donation_System.Blood_Donation_System.model.UsersModel;
import com.Blood_Donation_System.Blood_Donation_System.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;


    @GetMapping("/login")
    public String getLoginPage(Model model){
        model.addAttribute("loginRequest", new UsersModel());
        return "login_page";
    }
    @GetMapping("/register")
    public String getRegisterPage(Model model){
        model.addAttribute("registerRequest", new UsersModel());
        return "register_page";
    }
    @PostMapping("/register")
    public String register(@ModelAttribute UsersModel usersModel){
        System.out.println("register request: "+ usersModel);
        UsersModel registeredUser=usersService.registerUser(usersModel.getLogin(),usersModel.getPassword(),usersModel.getEmail());
        if (registeredUser == null) {
            return "error_page";
        }else
            return "redirect:/login";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute UsersModel usersModel,Model model){
        System.out.println("login request: "+ usersModel);
        UsersModel authenticated=usersService.authenticate(usersModel.getLogin(),usersModel.getPassword());
        if(authenticated != null){
            model.addAttribute("userLogin",authenticated.getLogin());
            return "home_page";
        } else {
            return "error_page";
        }
    }
}

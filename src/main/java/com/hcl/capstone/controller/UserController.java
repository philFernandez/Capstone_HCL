package com.hcl.capstone.controller;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    // @GetMapping("/register")
    // public ModelAndView register() {
    // return new ModelAndView("register", "user", new User());
    // }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

}

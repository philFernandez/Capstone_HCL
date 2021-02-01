package com.hcl.capstone.controller;

import com.hcl.capstone.model.User;
import com.hcl.capstone.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("register", "user", new User());
    }

    @PostMapping("/register")
    public String registerNew(@ModelAttribute User user) {
        repository.save(user);
        return ("redirect:/login");
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login", "user", new User());
    }

    @PostMapping("/login")
    public String loggedIn() {
        // return new ModelAndView("login", "user", new User());
        return "login";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/403")
    public String error403() {
        return "403";
    }


}

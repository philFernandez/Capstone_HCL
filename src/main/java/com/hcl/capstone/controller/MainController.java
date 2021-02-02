package com.hcl.capstone.controller;

import com.hcl.capstone.model.User;
import com.hcl.capstone.model.UserRepository;
import com.hcl.capstone.service.ProductService;
import com.hcl.capstone.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private ProductService productService;
    @Autowired
    private ShoppingCartService cartService;

    @GetMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("register", "user", new User());
    }

    @PostMapping("/register")
    public String registerNew(@ModelAttribute User user) {
        userRepo.save(user);
        return ("redirect:/login");
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login", "user", new User());
    }

    @PostMapping("/login")
    public String loggedIn() {
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

    @GetMapping("/products")
    public ModelAndView products() {
        return new ModelAndView("products", "cart",
                cartService);
    }

    @GetMapping("/products/instruments")
    public ModelAndView instruments() {
        return new ModelAndView("instruments", "instrumentList",
                productService.getInstruments());
    }


}

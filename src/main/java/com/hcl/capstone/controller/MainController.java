package com.hcl.capstone.controller;

import java.security.Principal;
import java.text.ParseException;
import javax.servlet.http.HttpServletRequest;
import com.hcl.capstone.model.Product;
import com.hcl.capstone.model.User;
import com.hcl.capstone.model.UserRepository;
import com.hcl.capstone.service.ProductService;
import com.hcl.capstone.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



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
    public ModelAndView products(HttpServletRequest request) {
        Principal principal = request.getUserPrincipal();
        try {
            cartService.linkUserToCart(principal);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new ModelAndView("products", "cart",
                cartService);
    }

    @GetMapping("products/{id}")
    public ModelAndView addToCart(@PathVariable Long id) {
        cartService.addToOrder(productService.getProductByID(id));
        return new ModelAndView("shoppingcart", "cart", cartService);
    }

    @GetMapping("/products/instruments")
    public ModelAndView instruments() {
        return new ModelAndView("instruments", "instrumentList",
                productService.getInstruments());
    }

    @GetMapping("/shoppingcart")
    public ModelAndView viewCart() {
        return new ModelAndView("shoppingcart", "cart", cartService);
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}

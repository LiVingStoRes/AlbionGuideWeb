package com.living.albionWebSite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class MainController {

    @GetMapping("/home")
    public String mainController(Model model) {
        model.addAttribute("name", "name"); 
        return "home";
    }

} 
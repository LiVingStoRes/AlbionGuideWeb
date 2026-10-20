package com.living.albionWebSite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class SpringDocController {

    @GetMapping("/springDoc")
    public String doc(Model model) {
        model.addAttribute("name", "name"); 
        return "springDoc";
    }

} 
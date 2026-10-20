package com.living.albionWebSite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class SpringBootController {

    @GetMapping("/springBoot")
    public String boot(Model model) {
        model.addAttribute("name", "name"); 
        return "springBoot";
    }

}


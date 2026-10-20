package com.living.albionWebSite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class SpringWebController {
    
    @GetMapping("/springWeb")
    public String web(Model model) {
        model.addAttribute("name", "name"); 
        return "springWeb";
    }

}

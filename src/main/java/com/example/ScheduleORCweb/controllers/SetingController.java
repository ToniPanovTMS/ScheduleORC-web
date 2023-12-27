package com.example.ScheduleORCweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SetingController {
    @GetMapping("/seting")
    public String controller(Model model){
        model.addAttribute("title", "Настройки");
        return "Seting";
    }
}

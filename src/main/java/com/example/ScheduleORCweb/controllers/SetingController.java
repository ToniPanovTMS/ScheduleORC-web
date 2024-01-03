package com.example.ScheduleORCweb.controllers;

import com.example.ScheduleORCweb.models.phons_namber;
import com.example.ScheduleORCweb.repo.phons_namberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SetingController {

    @Autowired
    private phons_namberRepository phons_namberRepository;
    @GetMapping("/seting")
    public String SetingController(Model model){
        Iterable<phons_namber> phons_nambers = phons_namberRepository.findAll();
        model.addAttribute("phons_namber", phons_nambers);
        return "Seting";
    }
    @GetMapping("/seting/add")
    public String SetingAddController(Model model){
        Iterable<phons_namber> phons_nambers = phons_namberRepository.findAll();
        model.addAttribute("phons_namber", phons_nambers);
        return "SetingAdd";
    }
    @PostMapping("/seting/add")
    public String SetingAddPostController(@RequestParam String name, @RequestParam Short namber_phone,Model model){
        phons_namber phons_namber2 = new phons_namber(name,namber_phone);
        phons_namberRepository.save(phons_namber2);
        return "redirect:/seting";
    }
    @GetMapping("/seting/edit")
    public String SetingEditController(Model model){
        return "SetingEdit";
    }
    @PostMapping("/seting/edit")
    public String SetingEditPostController(@RequestParam Long idEdit,@RequestParam Short phoneEdit, Model model){
         phons_namber phons_namber1= phons_namberRepository.findById(idEdit).orElseThrow();
         phons_namber1.setNamber_phone(phoneEdit);
         phons_namberRepository.save(phons_namber1);
        return "redirect:/seting";
    }
    @GetMapping("/seting/delite")
    public String SetingDeliteController(Model model){
        return "SetingDelite";
    }
    @PostMapping("/seting/delite")
    public String SetingDelitePostController(@RequestParam Long idEdit, Model model){
        phons_namber phons_namber1= phons_namberRepository.findById(idEdit).orElseThrow();
        phons_namberRepository.delete(phons_namber1);
        return "redirect:/seting";
    }
}

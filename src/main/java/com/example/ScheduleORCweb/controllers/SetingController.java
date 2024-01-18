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
    public String SetingAddPostController(@RequestParam String nameAdd, @RequestParam String namberPhoneAdd,@RequestParam String nameEdit,@RequestParam String phoneNamberEdit,@RequestParam String nameDelete,Model model){
        if(nameAdd != ""&& namberPhoneAdd != null) {
            phons_namber phons_namber2 = new phons_namber(nameAdd, namberPhoneAdd);
            phons_namberRepository.save(phons_namber2);
        }
        if(nameEdit != "" && phoneNamberEdit != null){
            phons_namberRepository.UpdatePhoneNamberByName(phoneNamberEdit,nameEdit);
        }if(nameDelete != ""){
            phons_namberRepository.DeleteAllByName(nameDelete);
        }

        return "redirect:/seting";
    }
}

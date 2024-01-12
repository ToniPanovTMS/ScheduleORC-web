package com.example.ScheduleORCweb.controllers;

import com.example.ScheduleORCweb.models.phons_namber;
import com.example.ScheduleORCweb.models.schedule;
import com.example.ScheduleORCweb.repo.phons_namberRepository;
import com.example.ScheduleORCweb.repo.scheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
public class testController {

    @Autowired
    private phons_namberRepository phons_namberRepository;
    @Autowired
    private scheduleRepository scheduleRepository;
    @GetMapping("/test")
    public String testController(Model model){
        Iterable<phons_namber> phons_nambers = phons_namberRepository.findAll();
        model.addAttribute("phons_namber", phons_nambers);
        model.addAttribute("schedule", scheduleRepository.findNameByAll("2 2024","Среда","Until1"));
        return "test";
    }

    @PostMapping("/test")
    public String testPostController(@RequestParam String manUntil1, Model model){
//week_of_the_year
        Calendar cal = Calendar.getInstance();
        if(manUntil1.equals("Delete")){
            scheduleRepository.deleteNameByAll(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "Until1");
        }else if(manUntil1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "Until1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "Until1", manUntil1);
                scheduleRepository.save(schedule1);

            }else{
                scheduleRepository.UPDATENameByAll(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR),"Среда","Until1",manUntil1);
            }
        }
        return "redirect:/";
    }
}

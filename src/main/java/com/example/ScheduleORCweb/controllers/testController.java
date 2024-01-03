package com.example.ScheduleORCweb.controllers;

import com.example.ScheduleORCweb.models.phons_namber;
import com.example.ScheduleORCweb.models.schedule;
import com.example.ScheduleORCweb.repo.phons_namberRepository;
import com.example.ScheduleORCweb.repo.scheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class testController {

    @Autowired
    private phons_namberRepository phons_namberRepository;
    @Autowired
    private scheduleRepository scheduleRepository;
    @GetMapping("/test")
    public String SetingController(Model model){
        Iterable<phons_namber> phons_nambers = phons_namberRepository.findAll();
        model.addAttribute("phons_namber", phons_nambers);
        return "test";
    }

    @PostMapping("/test")
    public String testPostController(@RequestParam String manUntil1, Model model){
//week_of_the_year
        Date d1 = new Date();
        Calendar cal = Calendar.getInstance();
        schedule schedule1 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "Until", manUntil1);
        scheduleRepository.save(schedule1);
        return "redirect:/";
    }
}

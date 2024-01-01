package com.example.ScheduleORCweb.controllers;

import com.example.ScheduleORCweb.models.phons_namber;
import com.example.ScheduleORCweb.models.schedule;
import com.example.ScheduleORCweb.repo.phons_namberRepository;
import com.example.ScheduleORCweb.repo.scheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;
import java.util.Date;

@Controller
public class MainController {

    @Autowired
    private phons_namberRepository phons_namberRepository;
    @Autowired
    private scheduleRepository scheduleRepository;
    @GetMapping("/")
    public String greeting(Model model) {
        Iterable<phons_namber> phons_nambers = phons_namberRepository.findAll();
        model.addAttribute("phons_namber", phons_nambers);
        return "main";
    }
    @PostMapping("/")
    public String SetingAddPostController(@RequestParam String sat1,
                                          @RequestParam String manUntil1,@RequestParam String manUntil2,@RequestParam String manUntil3,@RequestParam String TueUntil1,@RequestParam String TueUntil2,@RequestParam String TueUntil3,@RequestParam String WedUntil1,@RequestParam String WedUntil2,@RequestParam String WedUntil3,@RequestParam String ThuUntil1,@RequestParam String ThuUntil2,@RequestParam String ThuUntil3,@RequestParam String FriUntil1,@RequestParam String FriUntil2,@RequestParam String FriUntil3,@RequestParam String Sat2,
                                          @RequestParam String manUntil4,@RequestParam String manUntil5,@RequestParam String manUntil6,@RequestParam String TueUntil4,@RequestParam String TueUntil5,@RequestParam String TueUntil6,@RequestParam String WedUntil4,@RequestParam String WedUntil5,@RequestParam String WedUntil6,@RequestParam String ThuUntil4,@RequestParam String ThuUntil5,@RequestParam String ThuUntil6,@RequestParam String FriUntil4,@RequestParam String FriUntil5,@RequestParam String FriUntil6,@RequestParam String Sat3,
                                          @RequestParam String manAfter1,@RequestParam String manAfter2,@RequestParam String manAfter3,@RequestParam String TueAfter1,@RequestParam String TueAfter2,@RequestParam String TueAfter3,@RequestParam String WedAfter1,@RequestParam String WedAfter2,@RequestParam String WedAfter3,@RequestParam String ThuAfter1,@RequestParam String ThuAfter2,@RequestParam String ThuAfter3,@RequestParam String FriAfter1,@RequestParam String FriAfter2,@RequestParam String FriAfter3,@RequestParam String Sat4,
                                          @RequestParam String manAfter4,@RequestParam String manAfter5,@RequestParam String manAfter6,@RequestParam String TueAfter4,@RequestParam String TueAfter5,@RequestParam String TueAfter6,@RequestParam String WedAfter4,@RequestParam String WedAfter5,@RequestParam String WedAfter6,@RequestParam String ThuAfter4,@RequestParam String ThuAfter5,@RequestParam String ThuAfter6,@RequestParam String FriAfter4,@RequestParam String FriAfter5,@RequestParam String FriAfter6
    ){
        //week_of_the_year
        Date d1 = new Date();
        Calendar cl = Calendar. getInstance();
        cl.setTime(d1);
        String weak= String.valueOf(cl.WEEK_OF_YEAR);
        String ear= String.valueOf(cl.YEAR);

        if(manUntil1!=""){
            schedule scheduleManUntil1 = new schedule(weak+" "+ear,"Понидельник","Until",manUntil1);
            scheduleRepository.save(scheduleManUntil1);}
        if(manUntil1!="") {
            schedule scheduleManUntil2 = new schedule(weak + " " + ear, "Понидельник", "Until", manUntil2);
            scheduleRepository.save(scheduleManUntil2);
        }
        return "redirect:/";
    }
}
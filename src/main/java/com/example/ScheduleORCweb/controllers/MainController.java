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
        Calendar cal = Calendar.getInstance();
        if(manUntil1!=""){
            schedule scheduleManUntil1 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "Until", manUntil1);
            scheduleRepository.save(scheduleManUntil1);
        }if(manUntil2!=""){
            schedule scheduleManUntil2 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "Until", manUntil2);
            scheduleRepository.save(scheduleManUntil2);
        }if(manUntil3!="") {
            schedule scheduleManUntil3 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "Until", manUntil3);
            scheduleRepository.save(scheduleManUntil3);
        }if(manUntil4!=""){
            schedule scheduleManUntil4 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "Until", manUntil4);
            scheduleRepository.save(scheduleManUntil4);
        }if(manUntil5!=""){
            schedule scheduleManUntil5 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "Until", manUntil5);
            scheduleRepository.save(scheduleManUntil5);
        }if(manUntil6!="") {
            schedule scheduleManUntil6 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "Until", manUntil6);
            scheduleRepository.save(scheduleManUntil6);
        }if(manAfter1!=""){
            schedule scheduleManAfter1 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "After", manAfter1);
            scheduleRepository.save(scheduleManAfter1);
        }if(manAfter2!=""){
            schedule scheduleManAfter2 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "After", manAfter2);
            scheduleRepository.save(scheduleManAfter2);
        }if(manAfter3!="") {
            schedule scheduleManAfter3 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "After", manAfter3);
            scheduleRepository.save(scheduleManAfter3);
        }if(manAfter4!=""){
            schedule scheduleManAfter4 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "After", manAfter4);
            scheduleRepository.save(scheduleManAfter4);
        }if(manAfter5!=""){
            schedule scheduleManAfter5 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "After", manAfter5);
            scheduleRepository.save(scheduleManAfter5);
        }if(manAfter6!="") {
            schedule scheduleManAfter6 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "After", manAfter6);
            scheduleRepository.save(scheduleManAfter6);
        }


        if(TueUntil1!=""){
            schedule scheduleTueUntil1 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Вторник", "Until", TueUntil1);
            scheduleRepository.save(scheduleTueUntil1);
        }if(TueUntil2!=""){
            schedule scheduleTueUntil2 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Вторник", "Until", TueUntil2);
            scheduleRepository.save(scheduleTueUntil2);
        }if(TueUntil3!=""){
            schedule scheduleTueUntil3 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Вторник", "Until", TueUntil3);
            scheduleRepository.save(scheduleTueUntil3);
        }if(TueUntil4!=""){
            schedule scheduleTueUntil4 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Вторник", "Until", TueUntil4);
            scheduleRepository.save(scheduleTueUntil4);
        }if(TueUntil5!=""){
            schedule scheduleTueUntil5 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Вторник", "Until", TueUntil5);
            scheduleRepository.save(scheduleTueUntil5);
        }if(TueUntil6!=""){
            schedule scheduleTueUntil6 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Вторник", "Until", TueUntil6);
            scheduleRepository.save(scheduleTueUntil6);
        }if(TueAfter1!=""){
            schedule scheduleTueAfter1 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Вторник", "After", TueAfter1);
            scheduleRepository.save(scheduleTueAfter1);
        }if(TueAfter2!=""){
            schedule scheduleTueAfter2 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Вторник", "After", TueAfter2);
            scheduleRepository.save(scheduleTueAfter2);
        }if(TueAfter3!=""){
            schedule scheduleTueAfter3 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Вторник", "After", TueAfter3);
            scheduleRepository.save(scheduleTueAfter3);
        }if(TueAfter4!=""){
            schedule scheduleTueAfter4 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Вторник", "After", TueAfter4);
            scheduleRepository.save(scheduleTueAfter4);
        }if(TueAfter5!=""){
            schedule scheduleTueAfter5 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Вторник", "After", TueAfter5);
            scheduleRepository.save(scheduleTueAfter5);
        }if(TueAfter6!=""){
            schedule scheduleTueAfter6 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Вторник", "After", TueAfter6);
            scheduleRepository.save(scheduleTueAfter6);
        }


        if(WedUntil1!=""){
            schedule scheduleWedUntil1 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "Until", WedUntil1);
            scheduleRepository.save(scheduleWedUntil1);
        }if(WedUntil2!=""){
            schedule scheduleWedUntil2 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "Until", WedUntil2);
            scheduleRepository.save(scheduleWedUntil2);
        }if(WedUntil3!=""){
            schedule scheduleWedUntil3 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "Until", WedUntil3);
            scheduleRepository.save(scheduleWedUntil3);
        }if(WedUntil4!=""){
            schedule scheduleWedUntil4 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "Until", WedUntil4);
            scheduleRepository.save(scheduleWedUntil4);
        }if(WedUntil5!=""){
            schedule scheduleWedUntil5 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "Until", WedUntil5);
            scheduleRepository.save(scheduleWedUntil5);
        }if(WedUntil6!=""){
            schedule scheduleWedUntil6 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "Until", WedUntil6);
            scheduleRepository.save(scheduleWedUntil6);
        }if(WedAfter1!=""){
            schedule scheduleWedAfter1 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "After", WedAfter1);
            scheduleRepository.save(scheduleWedAfter1);
        }if(WedAfter2!=""){
            schedule scheduleWedAfter2 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "After", WedAfter2);
            scheduleRepository.save(scheduleWedAfter2);
        }if(WedAfter3!=""){
            schedule scheduleWedAfter3 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "After", WedAfter3);
            scheduleRepository.save(scheduleWedAfter3);
        }if(WedAfter4!=""){
            schedule scheduleWedAfter4 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "After", WedAfter4);
            scheduleRepository.save(scheduleWedAfter4);
        }if(WedAfter5!=""){
            schedule scheduleWedAfter5 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "After", WedAfter5);
            scheduleRepository.save(scheduleWedAfter5);
        }if(WedAfter6!=""){
            schedule scheduleWedAfter6 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Среда", "After", WedAfter6);
            scheduleRepository.save(scheduleWedAfter6);
        }


        if(ThuUntil1!=""){
            schedule scheduleThuUntil1 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Четверг", "Until", ThuUntil1);
            scheduleRepository.save(scheduleThuUntil1);
        }if(ThuUntil2!=""){
            schedule scheduleThuUntil2 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Четверг", "Until", ThuUntil2);
            scheduleRepository.save(scheduleThuUntil2);
        }if(ThuUntil3!=""){
            schedule scheduleThuUntil3 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Четверг", "Until", ThuUntil3);
            scheduleRepository.save(scheduleThuUntil3);
        } if(ThuUntil4!=""){
            schedule scheduleThuUntil4 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Четверг", "Until", ThuUntil4);
            scheduleRepository.save(scheduleThuUntil4);
        }if(ThuUntil5!=""){
            schedule scheduleThuUntil5 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Четверг", "Until", ThuUntil5);
            scheduleRepository.save(scheduleThuUntil5);
        }if(ThuUntil6!=""){
            schedule scheduleThuUntil6 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Четверг", "Until", ThuUntil6);
            scheduleRepository.save(scheduleThuUntil6);
        }if(ThuAfter1!=""){
            schedule scheduleThuAfter1 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Четверг", "After", ThuAfter1);
            scheduleRepository.save(scheduleThuAfter1);
        }if(ThuAfter2!=""){
            schedule scheduleThuAfter2 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Четверг", "After", ThuAfter2);
            scheduleRepository.save(scheduleThuAfter2);
        }if(ThuAfter3!=""){
            schedule scheduleThuAfter3 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Четверг", "After", ThuAfter3);
            scheduleRepository.save(scheduleThuAfter3);
        }if(ThuAfter4!=""){
            schedule scheduleThuAfter4 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Четверг", "After", ThuAfter4);
            scheduleRepository.save(scheduleThuAfter4);
        }if(ThuAfter5!=""){
            schedule scheduleThuAfter5 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Четверг", "After", ThuAfter5);
            scheduleRepository.save(scheduleThuAfter5);
        }if(ThuAfter6!=""){
            schedule scheduleThuAfter6 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Четверг", "After", ThuAfter6);
            scheduleRepository.save(scheduleThuAfter6);
        }


        if(FriUntil1!=""){
            schedule scheduleFriUntil1 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Пятница", "Until", FriUntil1);
            scheduleRepository.save(scheduleFriUntil1);
        }if(FriUntil2!=""){
            schedule scheduleFriUntil2 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Пятница", "Until", FriUntil2);
            scheduleRepository.save(scheduleFriUntil2);
        }if(FriUntil3!=""){
            schedule scheduleFriUntil3 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Пятница", "Until", FriUntil3);
            scheduleRepository.save(scheduleFriUntil3);
        }if(FriUntil4!=""){
            schedule scheduleFriUntil4 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Пятница", "Until", FriUntil4);
            scheduleRepository.save(scheduleFriUntil4);
        }if(FriUntil5!=""){
            schedule scheduleFriUntil5 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Пятница", "Until", FriUntil5);
            scheduleRepository.save(scheduleFriUntil5);
        }if(FriUntil6!=""){
            schedule scheduleFriUntil6 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Пятница", "Until", FriUntil6);
            scheduleRepository.save(scheduleFriUntil6);
        }if(FriAfter1!=""){
            schedule scheduleFriAfter1 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Пятница", "After", FriAfter1);
            scheduleRepository.save(scheduleFriAfter1);
        }if(FriAfter2!=""){
            schedule scheduleFriAfter2 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Пятница", "After", FriAfter2);
            scheduleRepository.save(scheduleFriAfter2);
        }if(FriAfter3!=""){
            schedule scheduleFriAfter3 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Пятница", "After", FriAfter3);
            scheduleRepository.save(scheduleFriAfter3);
        }if(FriAfter4!=""){
            schedule scheduleFriAfter4 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Пятница", "After", FriAfter4);
            scheduleRepository.save(scheduleFriAfter4);
        }if(FriAfter5!=""){
            schedule scheduleFriAfter5 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Пятница", "After", FriAfter5);
            scheduleRepository.save(scheduleFriAfter5);
        }if(FriAfter6!=""){
            schedule scheduleFriAfter6 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Пятница", "After", FriAfter6);
            scheduleRepository.save(scheduleFriAfter6);
        }


        if(sat1!=""){
            schedule scheduleSat1 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Суббота", "Until", sat1);
            scheduleRepository.save(scheduleSat1);
        }
        if(Sat2!=""){
            schedule scheduleSat2 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Суббота", "Until", Sat2);
            scheduleRepository.save(scheduleSat2);

        }
        if(Sat3!=""){
            schedule scheduleSat3 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Пятница", "Until", Sat3);
            scheduleRepository.save(scheduleSat3);
        }
        if(Sat4!=""){
            schedule scheduleSat4 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Суббота", "Until", Sat4);
            scheduleRepository.save(scheduleSat4);
        }
        return "redirect:/";
    }


    /*
    @PostMapping("/")
    public String SetingAddPostController(@RequestParam String manUntil1,@RequestParam String manUntil2, Model model) {
//week_of_the_year
        Calendar cal = Calendar.getInstance();
            if(!manUntil1.equals(" ")) {
                schedule schedulemanUntil1 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "Until", manUntil1);
                scheduleRepository.save(schedulemanUntil1);
            }
            if(!manUntil2.equals(" ")) {
                schedule schedulemanUntil2 = new schedule(cal.get(Calendar.WEEK_OF_YEAR) + " " + cal.get(Calendar.YEAR), "Понидельник", "Until", manUntil2);
                scheduleRepository.save(schedulemanUntil2);
            }
        return "redirect:/";
    }

     */
}
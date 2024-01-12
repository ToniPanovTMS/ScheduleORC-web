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
import java.util.List;

import static org.hibernate.sql.ast.SqlTreeCreationLogger.LOGGER;

@Controller
public class ScheduleController {

    @Autowired
    private com.example.ScheduleORCweb.repo.phons_namberRepository phons_namberRepository;
    @Autowired
    private com.example.ScheduleORCweb.repo.scheduleRepository scheduleRepository;

    @GetMapping("/scheduleNext")
    public String schedule_next_greeting(Model model) {
        Iterable<phons_namber> phons_nambers = phons_namberRepository.findAll();
        model.addAttribute("phons_namber", phons_nambers);
        Calendar cal = Calendar.getInstance();
        int WEEK_OF_YEAR = cal.get(Calendar.WEEK_OF_YEAR);
        model.addAttribute("scheduleManUntil1", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until1"));
        model.addAttribute("scheduleManUntil1", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until1"));
        model.addAttribute("scheduleManUntil2", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until2"));
        model.addAttribute("scheduleManUntil3", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Unti3"));
        model.addAttribute("scheduleManUntil4", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until4"));
        model.addAttribute("scheduleManUntil5", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until5"));
        model.addAttribute("scheduleManUntil6", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until6"));
        model.addAttribute("scheduleManAfter1", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After1"));
        model.addAttribute("scheduleManAfter2", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After2"));
        model.addAttribute("scheduleManAfter3", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After3"));
        model.addAttribute("scheduleManAfter4", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After4"));
        model.addAttribute("scheduleManAfter5", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After5"));
        model.addAttribute("scheduleManAfter6", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After6"));
        model.addAttribute("scheduleTueUntil1", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until1"));
        model.addAttribute("scheduleTueUntil2", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until2"));
        model.addAttribute("scheduleTueUntil3", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until3"));
        model.addAttribute("scheduleTueUntil4", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until4"));
        model.addAttribute("scheduleTueUntil5", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until5"));
        model.addAttribute("scheduleTueUntil6", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until6"));
        model.addAttribute("scheduleTueAfter1", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After1"));
        model.addAttribute("scheduleTueAfter2", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After2"));
        model.addAttribute("scheduleTueAfter3", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After3"));
        model.addAttribute("scheduleTueAfter4", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After4"));
        model.addAttribute("scheduleTueAfter5", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After5"));
        model.addAttribute("scheduleTueAfter6", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After6"));
        model.addAttribute("scheduleWedUntil1", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until1"));
        model.addAttribute("scheduleWedUntil2", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until2"));
        model.addAttribute("scheduleWedUntil3", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until3"));
        model.addAttribute("scheduleWedUntil4", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until4"));
        model.addAttribute("scheduleWedUntil5", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until5"));
        model.addAttribute("scheduleWedUntil6", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until6"));
        model.addAttribute("scheduleWedAfter1", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After1"));
        model.addAttribute("scheduleWedAfter2", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After2"));
        model.addAttribute("scheduleWedAfter3", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After3"));
        model.addAttribute("scheduleWedAfter4", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After4"));
        model.addAttribute("scheduleWedAfter5", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After5"));
        model.addAttribute("scheduleWedAfter6", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After6"));
        model.addAttribute("scheduleThuUntil1", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until1"));
        model.addAttribute("scheduleThuUntil2", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until2"));
        model.addAttribute("scheduleThuUntil3", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until3"));
        model.addAttribute("scheduleThuUntil4", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until4"));
        model.addAttribute("scheduleThuUntil5", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until5"));
        model.addAttribute("scheduleThuUntil6", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until6"));
        model.addAttribute("scheduleThuAfter1", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After1"));
        model.addAttribute("scheduleThuAfter2", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After2"));
        model.addAttribute("scheduleThuAfter3", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After3"));
        model.addAttribute("scheduleThuAfter4", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After4"));
        model.addAttribute("scheduleThuAfter5", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After5"));
        model.addAttribute("scheduleThuAfter6", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After6"));
        model.addAttribute("scheduleFriUntil1", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until1"));
        model.addAttribute("scheduleFriUntil2", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until2"));
        model.addAttribute("scheduleFriUntil3", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until3"));
        model.addAttribute("scheduleFriUntil4", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until4"));
        model.addAttribute("scheduleFriUntil5", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until5"));
        model.addAttribute("scheduleFriUntil6", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until6"));
        model.addAttribute("scheduleFriAfter1", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After1"));
        model.addAttribute("scheduleFriAfter2", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After2"));
        model.addAttribute("scheduleFriAfter3", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After3"));
        model.addAttribute("scheduleFriAfter4", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After4"));
        model.addAttribute("scheduleFriAfter5", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After5"));
        model.addAttribute("scheduleFriAfter6", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After6"));
        model.addAttribute("scheduleSat1", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until1"));
        model.addAttribute("scheduleSat2", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until2"));
        model.addAttribute("scheduleSat3", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until3"));
        model.addAttribute("scheduleSat4", scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until4"));
        return "scheduleNext";
    }
    @GetMapping("/scheduleNow")
    public String schedule_now_greeting(Model model) {
        Iterable<phons_namber> phons_nambers = phons_namberRepository.findAll();
        model.addAttribute("phons_namber", phons_nambers);
        Calendar cal = Calendar.getInstance();

        int WEEK_OF_YEAR = cal.get(Calendar.WEEK_OF_YEAR);
        model.addAttribute("scheduleManUntil1", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until1"));
        model.addAttribute("scheduleManUntil1", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until1"));
        model.addAttribute("scheduleManUntil2", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until2"));
        model.addAttribute("scheduleManUntil3", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Unti3"));
        model.addAttribute("scheduleManUntil4", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until4"));
        model.addAttribute("scheduleManUntil5", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until5"));
        model.addAttribute("scheduleManUntil6", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until6"));
        model.addAttribute("scheduleManAfter1", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After1"));
        model.addAttribute("scheduleManAfter2", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After2"));
        model.addAttribute("scheduleManAfter3", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After3"));
        model.addAttribute("scheduleManAfter4", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After4"));
        model.addAttribute("scheduleManAfter5", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After5"));
        model.addAttribute("scheduleManAfter6", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After6"));
        model.addAttribute("scheduleTueUntil1", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until1"));
        model.addAttribute("scheduleTueUntil2", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until2"));
        model.addAttribute("scheduleTueUntil3", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until3"));
        model.addAttribute("scheduleTueUntil4", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until4"));
        model.addAttribute("scheduleTueUntil5", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until5"));
        model.addAttribute("scheduleTueUntil6", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until6"));
        model.addAttribute("scheduleTueAfter1", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After1"));
        model.addAttribute("scheduleTueAfter2", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After2"));
        model.addAttribute("scheduleTueAfter3", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After3"));
        model.addAttribute("scheduleTueAfter4", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After4"));
        model.addAttribute("scheduleTueAfter5", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After5"));
        model.addAttribute("scheduleTueAfter6", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After6"));
        model.addAttribute("scheduleWedUntil1", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until1"));
        model.addAttribute("scheduleWedUntil2", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until2"));
        model.addAttribute("scheduleWedUntil3", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until3"));
        model.addAttribute("scheduleWedUntil4", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until4"));
        model.addAttribute("scheduleWedUntil5", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until5"));
        model.addAttribute("scheduleWedUntil6", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until6"));
        model.addAttribute("scheduleWedAfter1", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After1"));
        model.addAttribute("scheduleWedAfter2", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After2"));
        model.addAttribute("scheduleWedAfter3", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After3"));
        model.addAttribute("scheduleWedAfter4", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After4"));
        model.addAttribute("scheduleWedAfter5", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After5"));
        model.addAttribute("scheduleWedAfter6", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After6"));
        model.addAttribute("scheduleThuUntil1", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until1"));
        model.addAttribute("scheduleThuUntil2", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until2"));
        model.addAttribute("scheduleThuUntil3", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until3"));
        model.addAttribute("scheduleThuUntil4", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until4"));
        model.addAttribute("scheduleThuUntil5", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until5"));
        model.addAttribute("scheduleThuUntil6", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until6"));
        model.addAttribute("scheduleThuAfter1", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After1"));
        model.addAttribute("scheduleThuAfter2", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After2"));
        model.addAttribute("scheduleThuAfter3", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After3"));
        model.addAttribute("scheduleThuAfter4", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After4"));
        model.addAttribute("scheduleThuAfter5", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After5"));
        model.addAttribute("scheduleThuAfter6", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After6"));
        model.addAttribute("scheduleFriUntil1", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until1"));
        model.addAttribute("scheduleFriUntil2", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until2"));
        model.addAttribute("scheduleFriUntil3", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until3"));
        model.addAttribute("scheduleFriUntil4", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until4"));
        model.addAttribute("scheduleFriUntil5", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until5"));
        model.addAttribute("scheduleFriUntil6", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until6"));
        model.addAttribute("scheduleFriAfter1", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After1"));
        model.addAttribute("scheduleFriAfter2", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After2"));
        model.addAttribute("scheduleFriAfter3", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After3"));
        model.addAttribute("scheduleFriAfter4", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After4"));
        model.addAttribute("scheduleFriAfter5", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After5"));
        model.addAttribute("scheduleFriAfter6", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After6"));
        model.addAttribute("scheduleSat1", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until1"));
        model.addAttribute("scheduleSat2", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until2"));
        model.addAttribute("scheduleSat3", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until3"));
        model.addAttribute("scheduleSat4", scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until4"));
        return "scheduleNow";
    }

    @PostMapping("/scheduleNext")
    public String schedule_next_PostController(@RequestParam String sat1,
                                          @RequestParam String manUntil1, @RequestParam String manUntil2, @RequestParam String manUntil3, @RequestParam String TueUntil1, @RequestParam String TueUntil2, @RequestParam String TueUntil3, @RequestParam String WedUntil1, @RequestParam String WedUntil2, @RequestParam String WedUntil3, @RequestParam String ThuUntil1, @RequestParam String ThuUntil2, @RequestParam String ThuUntil3, @RequestParam String FriUntil1, @RequestParam String FriUntil2, @RequestParam String FriUntil3, @RequestParam String Sat2,
                                          @RequestParam String manUntil4, @RequestParam String manUntil5, @RequestParam String manUntil6, @RequestParam String TueUntil4, @RequestParam String TueUntil5, @RequestParam String TueUntil6, @RequestParam String WedUntil4, @RequestParam String WedUntil5, @RequestParam String WedUntil6, @RequestParam String ThuUntil4, @RequestParam String ThuUntil5, @RequestParam String ThuUntil6, @RequestParam String FriUntil4, @RequestParam String FriUntil5, @RequestParam String FriUntil6, @RequestParam String Sat3,
                                          @RequestParam String manAfter1, @RequestParam String manAfter2, @RequestParam String manAfter3, @RequestParam String TueAfter1, @RequestParam String TueAfter2, @RequestParam String TueAfter3, @RequestParam String WedAfter1, @RequestParam String WedAfter2, @RequestParam String WedAfter3, @RequestParam String ThuAfter1, @RequestParam String ThuAfter2, @RequestParam String ThuAfter3, @RequestParam String FriAfter1, @RequestParam String FriAfter2, @RequestParam String FriAfter3, @RequestParam String Sat4,
                                          @RequestParam String manAfter4, @RequestParam String manAfter5, @RequestParam String manAfter6, @RequestParam String TueAfter4, @RequestParam String TueAfter5, @RequestParam String TueAfter6, @RequestParam String WedAfter4, @RequestParam String WedAfter5, @RequestParam String WedAfter6, @RequestParam String ThuAfter4, @RequestParam String ThuAfter5, @RequestParam String ThuAfter6, @RequestParam String FriAfter4, @RequestParam String FriAfter5, @RequestParam String FriAfter6
    ) {
        Calendar cal = Calendar.getInstance();
        int WEEK_OF_YEAR= cal.get(Calendar.WEEK_OF_YEAR);
        if(manUntil1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until1");
        }else if(manUntil1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until1", manUntil1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Понидельник","Until1",manUntil1);
            }
        }
        if(manUntil2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until2");
        }else if(manUntil2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until2", manUntil2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Понидельник","Until2",manUntil2);
            }
        }
        if(manUntil3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until3");
        }else if(manUntil3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until3", manUntil3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Понидельник","Until3",manUntil3);
            }
        }
        if(manUntil4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until4");
        }else if(manUntil4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until4", manUntil4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Понидельник","Until4",manUntil4);
            }
        }
        if(manUntil5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until5");
        }else if(manUntil5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until5", manUntil5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Понидельник","Until5",manUntil5);
            }
        }
        if(manUntil6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until6");
        }else if(manUntil6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "Until6", manUntil6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Понидельник","Until6",manUntil6);
            }
        }
        if(manAfter1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After1");
        }else if(manAfter1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After1", manAfter1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Понидельник","After1",manAfter1);
            }
        }
        if(manAfter2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After2");
        }else if(manAfter2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After2", manAfter2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Понидельник","After2",manAfter2);
            }
        }
        if(manAfter3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After3");
        }else if(manAfter3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After3", manAfter3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Понидельник","After3",manAfter3);
            }
        }
        if(manAfter4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After4");
        }else if(manAfter4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After4", manAfter4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Понидельник","After4",manAfter4);
            }
        }
        if(manAfter5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After5");
        }else if(manAfter5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After5", manAfter5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Понидельник","After5",manAfter5);
            }
        }
        if(manAfter6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After6");
        }else if(manAfter6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Понидельник", "After6", manAfter6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Понидельник","After6",manAfter6);
            }
        }


        if(TueUntil1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until1");
        }else if(TueUntil1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until1", TueUntil1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Вторник","Until1",TueUntil1);
            }
        }
        if(TueUntil2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until2");
        }else if(TueUntil2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until2", TueUntil2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Вторник","Until2",TueUntil2);
            }
        }
        if(TueUntil3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until3");
        }else if(TueUntil3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until3", TueUntil3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Вторник","Until3",TueUntil3);
            }
        }
        if(TueUntil4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until4");
        }else if(TueUntil4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until4", TueUntil4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Вторник","Until4",TueUntil4);
            }
        }
        if(TueUntil5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until5");
        }else if(TueUntil5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until5", TueUntil5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Вторник","Until5",TueUntil5);
            }
        }
        if(TueUntil6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until6");
        }else if(TueUntil6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "Until6", TueUntil6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Вторник","Until6",TueUntil6);
            }
        }
        if(TueAfter1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After1");
        }else if(TueAfter1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After1", TueAfter1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Вторник","After1",TueAfter1);
            }
        }
        if(TueAfter2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After2");
        }else if(TueAfter2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After2", TueAfter2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Вторник","After2",TueAfter2);
            }
        }
        if(TueAfter3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After3");
        }else if(TueAfter3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After3", TueAfter3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Вторник","After3",TueAfter3);
            }
        }
        if(TueAfter4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After4");
        }else if(TueAfter4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After4", TueAfter4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Вторник","After4",TueAfter4);
            }
        }
        if(TueAfter5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After5");
        }else if(TueAfter5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After5", TueAfter5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Вторник","After5",TueAfter5);
            }
        }
        if(TueAfter6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After6");
        }else if(TueAfter6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Вторник", "After6", TueAfter6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Вторник","After6",TueAfter6);
            }
        }


        if(WedUntil1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until1");
        }else if(WedUntil1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until1", WedUntil1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Среда","Until1",WedUntil1);
            }
        }
        if(WedUntil2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until2");
        }else if(WedUntil2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until2", WedUntil2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Среда","Until2",WedUntil2);
            }
        }
        if(WedUntil3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until3");
        }else if(WedUntil3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until3", WedUntil3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Среда","Until3",WedUntil3);
            }
        }
        if(WedUntil4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until4");
        }else if(WedUntil4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until4", WedUntil4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Среда","Until4",WedUntil4);
            }
        }
        if(WedUntil5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until5");
        }else if(WedUntil5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until5", WedUntil5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Среда","Until5",WedUntil5);
            }
        }
        if(WedUntil6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until6");
        }else if(WedUntil6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "Until6", WedUntil6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Среда","Until6",WedUntil6);
            }
        }
        if(WedAfter1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After1");
        }else if(WedAfter1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After1", WedAfter1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Среда","After1",WedAfter1);
            }
        }
        if(WedAfter2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After2");
        }else if(WedAfter2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After2", WedAfter2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Среда","After2",WedAfter2);
            }
        }
        if(WedAfter3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After3");
        }else if(WedAfter3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After3", WedAfter3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Среда","After3",WedAfter3);
            }
        }
        if(WedAfter4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After4");
        }else if(WedAfter4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After4", WedAfter4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Среда","After4",WedAfter4);
            }
        }
        if(WedAfter5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After5");
        }else if(WedAfter5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After5", WedAfter5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Среда","After5",WedAfter5);
            }
        }
        if(WedAfter6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After6");
        }else if(WedAfter6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Среда", "After6", WedAfter6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Среда","After6",WedAfter6);
            }
        }


        if(ThuUntil1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until1");
        }else if(ThuUntil1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until1", ThuUntil1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Четверг","Until1",ThuUntil1);
            }
        }
        if(ThuUntil2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until2");
        }else if(ThuUntil2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until2", ThuUntil2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Четверг","Until2",ThuUntil2);
            }
        }
        if(ThuUntil3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until3");
        }else if(ThuUntil3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until3", ThuUntil3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Четверг","Until3",ThuUntil3);
            }
        }
        if(ThuUntil4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until4");
        }else if(ThuUntil4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until4", ThuUntil4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Четверг","Until4",ThuUntil4);
            }
        }
        if(ThuUntil5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until5");
        }else if(ThuUntil5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until5", ThuUntil5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Четверг","Until5",ThuUntil5);
            }
        }
        if(ThuUntil6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until6");
        }else if(ThuUntil6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "Until6", ThuUntil6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Четверг","Until6",ThuUntil6);
            }
        }
        if(ThuAfter1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After1");
        }else if(ThuAfter1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After1", ThuAfter1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Четверг","After1",ThuAfter1);
            }
        }
        if(ThuAfter2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After2");
        }else if(ThuAfter2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After2", ThuAfter2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Четверг","After2",ThuAfter2);
            }
        }
        if(ThuAfter3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After3");
        }else if(ThuAfter3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After3", ThuAfter3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Четверг","After3",ThuAfter3);
            }
        }
        if(ThuAfter4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After4");
        }else if(ThuAfter4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After4", ThuAfter4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Четверг","After4",ThuAfter4);
            }
        }
        if(ThuAfter5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After5");
        }else if(ThuAfter5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After5", ThuAfter5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Четверг","After5",ThuAfter5);
            }
        }
        if(ThuAfter6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After6");
        }else if(ThuAfter6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Четверг", "After6", ThuAfter6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Четверг","After6",ThuAfter6);
            }
        }


        if(FriUntil1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until1");
        }else if(FriUntil1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until1", FriUntil1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Пятница","Until1",FriUntil1);
            }
        }
        if(FriUntil2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until2");
        }else if(FriUntil2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until2", FriUntil2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Пятница","Until2",FriUntil2);
            }
        }
        if(FriUntil3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until3");
        }else if(FriUntil3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until3", FriUntil3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Пятница","Until3",FriUntil3);
            }
        }
        if(FriUntil4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until4");
        }else if(FriUntil4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until4", FriUntil4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Пятница","Until4",FriUntil4);
            }
        }
        if(FriUntil5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until5");
        }else if(FriUntil5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until5", FriUntil5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Пятница","Until5",FriUntil5);
            }
        }
        if(FriUntil6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until6");
        }else if(FriUntil6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "Until6", FriUntil6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Пятница","Until6",FriUntil6);
            }
        }
        if(FriAfter1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After1");
        }else if(FriAfter1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After1", FriAfter1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Пятница","After1",FriAfter1);
            }
        }
        if(FriAfter2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After2");
        }else if(FriAfter2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After2", FriAfter2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Пятница","After2",FriAfter2);
            }
        }
        if(FriAfter3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After3");
        }else if(FriAfter3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After3", FriAfter3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Пятница","After3",FriAfter3);
            }
        }
        if(FriAfter4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After4");
        }else if(FriAfter4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After4", FriAfter4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Пятница","After4",FriAfter4);
            }
        }
        if(FriAfter5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After5");
        }else if(FriAfter5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After5", FriAfter5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Пятница","After5",FriAfter5);
            }
        }
        if(FriAfter6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After6");
        }else if(FriAfter6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Пятница", "After6", FriAfter6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Пятница","After6",FriAfter6);
            }
        }


        if(sat1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until1");
        }else if(sat1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until1", sat1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Суббота","Until1",sat1);
            }
        }
        if(Sat2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until2");
        }else if(Sat2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until2", Sat2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Суббота","Until2",Sat2);
            }
        }
        if(Sat3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until3");
        }else if(Sat3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until3", Sat3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Суббота","Until3",Sat3);
            }
        }
        if(Sat4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until4");
        }else if(Sat4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR), "Суббота", "Until4", Sat4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR+1 + " " + cal.get(Calendar.YEAR),"Суббота","Until4",Sat4);
            }
        }
        return "redirect:/scheduleNext";
    }
    @PostMapping("/scheduleNow")
    public String schedule_now_PostController(@RequestParam String sat1,
                                              @RequestParam String manUntil1, @RequestParam String manUntil2, @RequestParam String manUntil3, @RequestParam String TueUntil1, @RequestParam String TueUntil2, @RequestParam String TueUntil3, @RequestParam String WedUntil1, @RequestParam String WedUntil2, @RequestParam String WedUntil3, @RequestParam String ThuUntil1, @RequestParam String ThuUntil2, @RequestParam String ThuUntil3, @RequestParam String FriUntil1, @RequestParam String FriUntil2, @RequestParam String FriUntil3, @RequestParam String Sat2,
                                              @RequestParam String manUntil4, @RequestParam String manUntil5, @RequestParam String manUntil6, @RequestParam String TueUntil4, @RequestParam String TueUntil5, @RequestParam String TueUntil6, @RequestParam String WedUntil4, @RequestParam String WedUntil5, @RequestParam String WedUntil6, @RequestParam String ThuUntil4, @RequestParam String ThuUntil5, @RequestParam String ThuUntil6, @RequestParam String FriUntil4, @RequestParam String FriUntil5, @RequestParam String FriUntil6, @RequestParam String Sat3,
                                              @RequestParam String manAfter1, @RequestParam String manAfter2, @RequestParam String manAfter3, @RequestParam String TueAfter1, @RequestParam String TueAfter2, @RequestParam String TueAfter3, @RequestParam String WedAfter1, @RequestParam String WedAfter2, @RequestParam String WedAfter3, @RequestParam String ThuAfter1, @RequestParam String ThuAfter2, @RequestParam String ThuAfter3, @RequestParam String FriAfter1, @RequestParam String FriAfter2, @RequestParam String FriAfter3, @RequestParam String Sat4,
                                              @RequestParam String manAfter4, @RequestParam String manAfter5, @RequestParam String manAfter6, @RequestParam String TueAfter4, @RequestParam String TueAfter5, @RequestParam String TueAfter6, @RequestParam String WedAfter4, @RequestParam String WedAfter5, @RequestParam String WedAfter6, @RequestParam String ThuAfter4, @RequestParam String ThuAfter5, @RequestParam String ThuAfter6, @RequestParam String FriAfter4, @RequestParam String FriAfter5, @RequestParam String FriAfter6
    ) {
        Calendar cal = Calendar.getInstance();
        int WEEK_OF_YEAR= cal.get(Calendar.WEEK_OF_YEAR);
        if(manUntil1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until1");
        }else if(manUntil1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until1", manUntil1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Понидельник","Until1",manUntil1);
            }
        }
        if(manUntil2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until2");
        }else if(manUntil2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until2", manUntil2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Понидельник","Until2",manUntil2);
            }
        }
        if(manUntil3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until3");
        }else if(manUntil3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until3", manUntil3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Понидельник","Until3",manUntil3);
            }
        }
        if(manUntil4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until4");
        }else if(manUntil4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until4", manUntil4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Понидельник","Until4",manUntil4);
            }
        }
        if(manUntil5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until5");
        }else if(manUntil5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until5", manUntil5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Понидельник","Until5",manUntil5);
            }
        }
        if(manUntil6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until6");
        }else if(manUntil6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "Until6", manUntil6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Понидельник","Until6",manUntil6);
            }
        }
        if(manAfter1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After1");
        }else if(manAfter1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After1", manAfter1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Понидельник","After1",manAfter1);
            }
        }
        if(manAfter2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After2");
        }else if(manAfter2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After2", manAfter2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Понидельник","After2",manAfter2);
            }
        }
        if(manAfter3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After3");
        }else if(manAfter3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After3", manAfter3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Понидельник","After3",manAfter3);
            }
        }
        if(manAfter4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After4");
        }else if(manAfter4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After4", manAfter4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Понидельник","After4",manAfter4);
            }
        }
        if(manAfter5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After5");
        }else if(manAfter5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After5", manAfter5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Понидельник","After5",manAfter5);
            }
        }
        if(manAfter6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After6");
        }else if(manAfter6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Понидельник", "After6", manAfter6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Понидельник","After6",manAfter6);
            }
        }


        if(TueUntil1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until1");
        }else if(TueUntil1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until1", TueUntil1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Вторник","Until1",TueUntil1);
            }
        }
        if(TueUntil2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until2");
        }else if(TueUntil2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until2", TueUntil2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Вторник","Until2",TueUntil2);
            }
        }
        if(TueUntil3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until3");
        }else if(TueUntil3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until3", TueUntil3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Вторник","Until3",TueUntil3);
            }
        }
        if(TueUntil4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until4");
        }else if(TueUntil4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until4", TueUntil4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Вторник","Until4",TueUntil4);
            }
        }
        if(TueUntil5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until5");
        }else if(TueUntil5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until5", TueUntil5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Вторник","Until5",TueUntil5);
            }
        }
        if(TueUntil6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until6");
        }else if(TueUntil6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "Until6", TueUntil6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Вторник","Until6",TueUntil6);
            }
        }
        if(TueAfter1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After1");
        }else if(TueAfter1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After1", TueAfter1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Вторник","After1",TueAfter1);
            }
        }
        if(TueAfter2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After2");
        }else if(TueAfter2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After2", TueAfter2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Вторник","After2",TueAfter2);
            }
        }
        if(TueAfter3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After3");
        }else if(TueAfter3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After3", TueAfter3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Вторник","After3",TueAfter3);
            }
        }
        if(TueAfter4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After4");
        }else if(TueAfter4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After4", TueAfter4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Вторник","After4",TueAfter4);
            }
        }
        if(TueAfter5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After5");
        }else if(TueAfter5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After5", TueAfter5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Вторник","After5",TueAfter5);
            }
        }
        if(TueAfter6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After6");
        }else if(TueAfter6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Вторник", "After6", TueAfter6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Вторник","After6",TueAfter6);
            }
        }


        if(WedUntil1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until1");
        }else if(WedUntil1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until1", WedUntil1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Среда","Until1",WedUntil1);
            }
        }
        if(WedUntil2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until2");
        }else if(WedUntil2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until2", WedUntil2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Среда","Until2",WedUntil2);
            }
        }
        if(WedUntil3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until3");
        }else if(WedUntil3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until3", WedUntil3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Среда","Until3",WedUntil3);
            }
        }
        if(WedUntil4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until4");
        }else if(WedUntil4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until4", WedUntil4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Среда","Until4",WedUntil4);
            }
        }
        if(WedUntil5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until5");
        }else if(WedUntil5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until5", WedUntil5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Среда","Until5",WedUntil5);
            }
        }
        if(WedUntil6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until6");
        }else if(WedUntil6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "Until6", WedUntil6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Среда","Until6",WedUntil6);
            }
        }
        if(WedAfter1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After1");
        }else if(WedAfter1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After1", WedAfter1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Среда","After1",WedAfter1);
            }
        }
        if(WedAfter2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After2");
        }else if(WedAfter2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After2", WedAfter2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Среда","After2",WedAfter2);
            }
        }
        if(WedAfter3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After3");
        }else if(WedAfter3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After3", WedAfter3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Среда","After3",WedAfter3);
            }
        }
        if(WedAfter4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After4");
        }else if(WedAfter4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After4", WedAfter4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Среда","After4",WedAfter4);
            }
        }
        if(WedAfter5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After5");
        }else if(WedAfter5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After5", WedAfter5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Среда","After5",WedAfter5);
            }
        }
        if(WedAfter6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After6");
        }else if(WedAfter6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Среда", "After6", WedAfter6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Среда","After6",WedAfter6);
            }
        }


        if(ThuUntil1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until1");
        }else if(ThuUntil1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until1", ThuUntil1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Четверг","Until1",ThuUntil1);
            }
        }
        if(ThuUntil2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until2");
        }else if(ThuUntil2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until2", ThuUntil2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Четверг","Until2",ThuUntil2);
            }
        }
        if(ThuUntil3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until3");
        }else if(ThuUntil3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until3", ThuUntil3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Четверг","Until3",ThuUntil3);
            }
        }
        if(ThuUntil4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until4");
        }else if(ThuUntil4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until4", ThuUntil4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Четверг","Until4",ThuUntil4);
            }
        }
        if(ThuUntil5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until5");
        }else if(ThuUntil5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until5", ThuUntil5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Четверг","Until5",ThuUntil5);
            }
        }
        if(ThuUntil6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until6");
        }else if(ThuUntil6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "Until6", ThuUntil6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Четверг","Until6",ThuUntil6);
            }
        }
        if(ThuAfter1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After1");
        }else if(ThuAfter1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After1", ThuAfter1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Четверг","After1",ThuAfter1);
            }
        }
        if(ThuAfter2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After2");
        }else if(ThuAfter2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After2", ThuAfter2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Четверг","After2",ThuAfter2);
            }
        }
        if(ThuAfter3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After3");
        }else if(ThuAfter3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After3", ThuAfter3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Четверг","After3",ThuAfter3);
            }
        }
        if(ThuAfter4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After4");
        }else if(ThuAfter4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After4", ThuAfter4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Четверг","After4",ThuAfter4);
            }
        }
        if(ThuAfter5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After5");
        }else if(ThuAfter5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After5", ThuAfter5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Четверг","After5",ThuAfter5);
            }
        }
        if(ThuAfter6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After6");
        }else if(ThuAfter6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Четверг", "After6", ThuAfter6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Четверг","After6",ThuAfter6);
            }
        }


        if(FriUntil1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until1");
        }else if(FriUntil1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until1", FriUntil1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Пятница","Until1",FriUntil1);
            }
        }
        if(FriUntil2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until2");
        }else if(FriUntil2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until2", FriUntil2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Пятница","Until2",FriUntil2);
            }
        }
        if(FriUntil3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until3");
        }else if(FriUntil3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until3", FriUntil3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Пятница","Until3",FriUntil3);
            }
        }
        if(FriUntil4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until4");
        }else if(FriUntil4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until4", FriUntil4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Пятница","Until4",FriUntil4);
            }
        }
        if(FriUntil5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until5");
        }else if(FriUntil5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until5", FriUntil5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Пятница","Until5",FriUntil5);
            }
        }
        if(FriUntil6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until6");
        }else if(FriUntil6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "Until6", FriUntil6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Пятница","Until6",FriUntil6);
            }
        }
        if(FriAfter1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After1");
        }else if(FriAfter1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After1", FriAfter1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Пятница","After1",FriAfter1);
            }
        }
        if(FriAfter2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After2");
        }else if(FriAfter2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After2", FriAfter2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Пятница","After2",FriAfter2);
            }
        }
        if(FriAfter3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After3");
        }else if(FriAfter3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After3", FriAfter3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Пятница","After3",FriAfter3);
            }
        }
        if(FriAfter4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After4");
        }else if(FriAfter4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After4", FriAfter4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Пятница","After4",FriAfter4);
            }
        }
        if(FriAfter5.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After5");
        }else if(FriAfter5 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After5");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After5", FriAfter5);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Пятница","After5",FriAfter5);
            }
        }
        if(FriAfter6.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After6");
        }else if(FriAfter6 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After6");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Пятница", "After6", FriAfter6);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Пятница","After6",FriAfter6);
            }
        }


        if(sat1.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until1");
        }else if(sat1 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until1");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until1", sat1);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Суббота","Until1",sat1);
            }
        }
        if(Sat2.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until2");
        }else if(Sat2 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until2");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until2", Sat2);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Суббота","Until2",Sat2);
            }
        }
        if(Sat3.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until3");
        }else if(Sat3 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until3");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until3", Sat3);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Суббота","Until3",Sat3);
            }
        }
        if(Sat4.equals("Delete")){
            scheduleRepository.deleteNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until4");
        }else if(Sat4 != ""){
            Iterable<schedule> t=scheduleRepository.findNameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until4");
            if(!t.iterator().hasNext()){
                schedule schedule1 = new schedule(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR), "Суббота", "Until4", Sat4);
                scheduleRepository.save(schedule1);
            }else{
                scheduleRepository.UPDATENameByAll(WEEK_OF_YEAR + " " + cal.get(Calendar.YEAR),"Суббота","Until4",Sat4);
            }
        }

        return "redirect:/scheduleNow";
    }
}

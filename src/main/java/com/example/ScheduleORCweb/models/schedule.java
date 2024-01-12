package com.example.ScheduleORCweb.models;

import jakarta.persistence.*;

@Entity
public class schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String week_of_the_year;
    private String day;
    private String until_after;
    private String name;

    public Long getId() {
        return id;
    }

    public String getDay() {
        return day;
    }

    public String getUntil_after() {
        return until_after;
    }

    public String getWeek_of_the_year() {
        return week_of_the_year;
    }

    public String getName() {
        return name;
    }

    public schedule(String week_of_the_year, String day, String until_after, String name) {
        this.week_of_the_year = week_of_the_year;
        this.day = day;
        this.until_after = until_after;
        this.name = name;
    }

    public schedule(Long id, String week_of_the_year, String day, String until_after, String name) {
        this.id = id;
        this.week_of_the_year = week_of_the_year;
        this.day = day;
        this.until_after = until_after;
        this.name = name;
    }

    public schedule() {
    }
}

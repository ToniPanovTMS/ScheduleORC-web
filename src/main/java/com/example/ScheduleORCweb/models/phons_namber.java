package com.example.ScheduleORCweb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class phons_namber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Short namber_phone;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getNamber_phone() {
        return namber_phone;
    }

    public void setNamber_phone(Short namber_phone) {
        this.namber_phone = namber_phone;
    }
    public phons_namber(String name, Short namber_phone) {
        this.name = name;
        this.namber_phone = namber_phone;
    }
    public phons_namber() {
    }

    public phons_namber(String name) {
        this.name = name;
    }
}


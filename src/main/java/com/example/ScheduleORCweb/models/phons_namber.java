package com.example.ScheduleORCweb.models;

import jakarta.persistence.*;

@Entity
public class phons_namber {
    @Id
    @SequenceGenerator(name = "seq",
            sequenceName = "sequence_phone",
            initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String namber_phone;


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

    public String getNamber_phone() {
        return namber_phone;
    }

    public void setNamber_phone(String namber_phone) {
        this.namber_phone = namber_phone;
    }
    public phons_namber(String name, String namber_phone) {
        this.name = name;
        this.namber_phone = namber_phone;
    }
    public phons_namber() {
    }

    public phons_namber(String name) {
        this.name = name;
    }
}


package com.example.FlightLogAPI;

import javax.persistence.*;

@Entity
@Table(name = "pilots")
public class Pilots {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public boolean isIs_employed() {
        return is_employed;
    }

    public void setIs_employed(boolean is_employed) {
        this.is_employed = is_employed;
    }

    private boolean is_employed;

    public Pilots() {
    }

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



}

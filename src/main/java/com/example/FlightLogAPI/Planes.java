package com.example.FlightLogAPI;

import javax.persistence.*;

@Entity
@Table(name = "planes")
public class Planes {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
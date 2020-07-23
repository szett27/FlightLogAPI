package com.example.FlightLogAPI;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
    @Table(name = "flights")
    public class Flights{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private Pilots pilot;
        private Planes plane;

        @Column(columnDefinition = "date")
        @JsonFormat(pattern = "yyyy-MM-dd hh:mm")
        private Date date;
        private String from;
        private String to;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Pilots getPilot() {
            return pilot;
        }

        public void setPilot(Pilots pilot) {
            this.pilot = pilot;
        }

        public Planes getPlane() {
            return plane;
        }

        public void setPlane(Planes plane) {
            this.plane = plane;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }






}

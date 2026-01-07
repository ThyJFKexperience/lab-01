package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private Date feltDate;

    public Mood() {
        this.feltDate = new Date();
    }

    public Mood(Date feltDate) {
        this.feltDate = feltDate;
    }

    public Date getFeltDate() {
        return feltDate;
    }

    public void setFeltDate(Date feltDate) {
        this.feltDate = feltDate;
    }
}

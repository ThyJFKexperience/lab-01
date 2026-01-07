package com.example.petshop;

import java.util.Date;

public class Sad extends Mood{

    public Sad() {
        super();
    }

    public Sad(Date feltDate) {
        super(feltDate);
    }

    public String feeling() {
        return "Feeling Sad...";
    }

}

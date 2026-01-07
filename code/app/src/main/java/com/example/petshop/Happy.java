package com.example.petshop;

import java.util.Date;

public class Happy extends Mood{

    public Happy() {
        super();
    }

    public Happy(Date feltDate) {
        super(feltDate);
    }

    public String feeling() {
        return "Feeling Happy!";
    }

}

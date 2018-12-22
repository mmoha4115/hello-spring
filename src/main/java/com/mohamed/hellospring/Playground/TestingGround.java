package com.mohamed.hellospring.Playground;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestingGround {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        int x=0;
        while(x<15000){
            x++;
        }
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println(date.after(date1));

    }
}


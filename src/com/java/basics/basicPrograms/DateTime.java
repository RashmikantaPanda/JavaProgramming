package com.java.basics.introduction;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime {
    public static void main(String[] args) {
        System.out.println("----- Date & Time ------");
        LocalDate date= LocalDate.now();
        System.out.print("Date : ");
        System.out.println(date);
        System.out.print("Time : ");
        LocalTime time=LocalTime.now();
        System.out.println(time);
    }
}

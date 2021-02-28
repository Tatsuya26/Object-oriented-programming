package com.company.Ex_part1;

import java.time.LocalDate;

public class Data {
    public String Final_dayofweak(int dayw, int month, int year) {
        LocalDate date = LocalDate.of(year,month,dayw);
        int dayofweek = dayofWeek(date);
        String day = "";
        switch (dayofweek) {
            case 0: day = "Sunday";    break;
            case 1: day = "Monday";    break;
            case 2: day = "Tuesday";   break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday";  break;
            case 5: day = "Friday";    break;
            case 6: day = "Saturday";  break;
        }
        return day;
    }


    public int dayofWeek(LocalDate date) {
        int year = (date.getYear() - 1900) * 365;
        year += (year - 1900)/ 4;
        if(date.isLeapYear() && date.getMonthValue() == 1 && date.getMonthValue() == 2) year--;
        for(int i = 1; i < date.getMonthValue(); i++) {
            LocalDate new_date = LocalDate.of(year,i,1);
            year += new_date.lengthOfMonth();
        }
        year += date.getDayOfMonth();
        return year % 7;
    }
}

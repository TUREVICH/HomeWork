package com.company;

public class Task6 {
    public void job6() {
        int day = 30;
        int month = 11;
        int year = 2020;

        if (month == 12 && day == 31) {
            day = 1;
            month = 1;
            year++;
        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && (day == 31)) {
            day = 1;
            month++;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day == 30)) {
            day = 1;
            month++;
        } else if (month == 2 && day == 29) {
            day = 1;
            month++;
        } else {

            if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day > 31)) {
                System.out.println("Exception");
            } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)) {
                System.out.println("Exception");
            } else if (month == 2 && day > 29){
                System.out.println("Exception");
            }else {
                day++;
            }
        }
        System.out.println(day + "." + month + "." + year);
    }
}

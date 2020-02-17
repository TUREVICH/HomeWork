package com.company;

public class Task6 {

    int day;
    int month;
    int year;

    public void task6() {
         day = 31;
         month = 12;
         year = 2020;
        int dayMax;


        if (year % 4 == 0){

            if (year == 1900){
                dayMax = 28;
            }else{
                dayMax = 29;
            }

        } else {
            dayMax = 28;
        }



        if (month == 12 && day == 31) {
            day = 1;
            month = 1;
            year++;
            sout();
        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && (day == 31)) {
            day = 1;
            month++;
            sout();
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day == 30)) {
            day = 1;
            month++;
            sout();
        } else if ( month == 2 && day == dayMax) {
            day = 1;
            month++;
            sout();
        } else {

            if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day > 31)) {
                System.out.println("Exception");
            } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)) {
                System.out.println("Exception");
            } else if (month == 2 && day > dayMax){
                System.out.println("Exception");
            }else {
                day++;
            }
        }
    }

    private void sout(){
        System.out.println(day + "." + month + "." + year);
    }
}

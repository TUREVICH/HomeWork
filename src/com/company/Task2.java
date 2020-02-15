package com.company;

public class Task2 {
    public void job2() {
        int s = 3700;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int w =(d - day)/7;

        System.out.println(s + " секунд" + "\n" + m + " минут" + "\n" + h + " часов" + "\n" + d + " дней" + "\n" + w + " недель");
    }
}

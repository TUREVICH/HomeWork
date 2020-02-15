package com.company;

public class Task5 {
    public void job5() {
        int cash = 221;
        int ost = cash % 10;
        if (cash > 4 && cash < 20) {
            System.out.println(cash + " рублей");
        } else if (ost == 1) {
            System.out.println(cash + " рубль");
        } else if (ost > 1 & ost < 5) {
            System.out.println(cash + " рубля");
        } else {
            System.out.println(cash + " рублей");
        }
    }
}


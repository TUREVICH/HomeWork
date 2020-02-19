package com.company;

public class Task8 {
    public void task8(){
        int s = 5;
        int factorial = 1;
        int i = 0;
        do {
            i++;
            factorial = factorial * i;
        } while (i < s && i > 0);

        System.out.println("factorial = " + factorial);
    }
}

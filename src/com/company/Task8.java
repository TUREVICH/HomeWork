package com.company;

public class Task8 {
    public void task8(){
        int s = 5;
        int factorial = 1;
        int i = 0;

        i++;
        factorial = factorial * i;

        while (i < s && i > 0){
            i++;
            factorial = factorial * i;
        }

        System.out.println("factorial = " + factorial);
    }
}

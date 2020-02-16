package com.company;

public class Task7 {
    int a = 2;
    int b = 3;
    int c = 8;
    int d = 5;
    int e = 8;
    int f = 7;

    public void task7() {
       if (a + d <= e || a + d <= f ||a + c <= e || a + c <= f || b + d <= e || b + d <= f || b + c <= e || b + c <= f){
           System.out.println("are placed");
       }else {
           System.out.println("aren't placed");
       }

    }
}

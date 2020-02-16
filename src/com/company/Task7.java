package com.company;

public class Task7 {
    int a = 3;
    int b = 11;
    int c = 5;
    int d = 3;
    int e = 5;
    int f = 15;
    boolean g;

    public void task7() {
        if (a + d <= e || a + d <= f || a + c <= e || a + c <= f || b + d <= e || b + d <= f || b + c <= e || b + c <= f){
            g = true;
        }else {
            g = false;
        }

        if (g == true){

           System.out.println("are placed");
       }else {
           System.out.println("aren't placed");
       }

    }
}

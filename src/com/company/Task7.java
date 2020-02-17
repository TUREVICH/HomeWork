package com.company;

public class Task7 {
    int a = 3;
    int b = 11;
    int c = 6;
    int d = 3;
    int e = 5;
    int f = 15;
    boolean g;

    public void task7() {

        if ((((a + c) <= e) && (b <= f && d <= f)) || (((b + d) <= f) && (a <= e && c <= e)) || (((b + c) <= e) && (a <= f && d <= f)) || (((a + d) <= e) && (b <= f && c <= f)) || (((a + d) <= f) && (b <= e && c <= e)) || (((b + c) <= f) && (a <= e && d <= e)) || (((a + c) <= f) && (b <= e && d <= e)) || (((b + d) <= e) && (a <= f && c <= f))) {
            g = true;
        } else {
            g = false;
        }

        if (g == true) {

            System.out.println("are placed");
        } else {
            System.out.println("aren't placed");
        }

    }
}
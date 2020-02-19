package com.company;

public class Task10 {
    public void task10() {
        int h = 123;
        int sum = 0;
        while (h != 0) {
            sum += (h % 10);
            h /= 10;
        }
        System.out.println(sum);
    }
}

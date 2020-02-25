package com.company;

public class Task19 {
    public static void main(String[] args) {
        int sum = 0;
        char pr = ' ';
        String string = "dsc   ads   acd  ascd   asddas cw ";
        string = pr + string;

        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) != pr && string.charAt(i - 1) == pr) {
                sum++;
            }
        }
        System.out.println("total words: " + sum);
    }
}

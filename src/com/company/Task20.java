package com.company;

public class Task20 {
    public static void main(String[] args) {

        char pr = ' ';
        String string = "dsc   ads   acd  ascd   asddas cw";
        StringBuilder text = new StringBuilder("Text : ");
        string = string + pr;

        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) != pr && string.charAt(i + 1) == pr) {
                text.append(string.charAt(i));
            }
        }
        System.out.print(text);
    }
}

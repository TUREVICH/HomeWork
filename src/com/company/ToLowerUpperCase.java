package com.company;

public class ToLowerUpperCase {

    static String string = "LoL, Кек";
    static char[] chars = string.toCharArray();

    public static void main(String[] args) {
        toUpper();
        toLower();
    }

    public static void toUpper() {
        for (int i = 0; i < string.length(); i++) {
            if ((chars[i] >= 'а') && (chars[i] <= 'я') || (chars[i] >= 'a') && (chars[i] <= 'z')) {
                chars[i] -= 32;
            }
        }
        string = String.valueOf(chars);
        System.out.println(string);
    }

    public static void toLower() {
        for (int i = 0; i < string.length(); i++) {
            if ((chars[i] >= 'А') && (chars[i] <= 'Я') || (chars[i] >= 'A') && (chars[i] <= 'Z')) {
                chars[i] += 32;
            }
        }
        string = String.valueOf(chars);
        System.out.println(string);
    }

}


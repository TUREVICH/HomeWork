package com.company;

public class ToLowerUpperCase {

    private static String string = "LoL, Кек";
    private static char[] chars = string.toCharArray();

    public static void main(String[] args) {
        toUpper();
        toLower();
    }

    private static void toUpper() {
        for (int i = 0; i < string.length(); i++) {
            if ((chars[i] >= 'а') && (chars[i] <= 'я') || (chars[i] >= 'a') && (chars[i] <= 'z')) {
                chars[i] -= 32;
            }
        }
        string = String.valueOf(chars);
        System.out.println(string);
    }

    private static void toLower() {
        for (int i = 0; i < string.length(); i++) {
            if ((chars[i] >= 'А') && (chars[i] <= 'Я') || (chars[i] >= 'A') && (chars[i] <= 'Z')) {
                chars[i] += 32;
            }
        }
        string = String.valueOf(chars);
        System.out.println(string);
    }

}


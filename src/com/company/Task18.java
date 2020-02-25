package com.company;

public class Task18 {

    public static void main(String[] args) {
        char[] chars = {'.', ',', '-', ':', ';', '?', '!', '@', '#', '$', '%', '^', '&', '*', '_', '<', '>', '/', '|', '~', '`', '=', '+', '(', ')', '{', '}', '[', ']', '"', '\\', '\'', '\"'};
        int sum = 0;
        String string = "!#$%&()*+,-./:;<=>?@[]^_`{|}~";

        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < chars.length; j++) {
                if (string.charAt(i) == chars[j]) {
                    sum++;
                    break;
                }
            }
        }
        System.out.println(sum);
    }

}

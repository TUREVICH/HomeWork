package com.company;

public class Task18 {

    public static void main(String[] args) {
        String str = "!#$%&()*+,-./:;<=>?@[]^_`{|}~ ";
        int sim = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!(Character.isWhitespace(str.charAt(i))) && !(Character.isLetterOrDigit(str.charAt(i)))) {
                sim++;
            }
        }
        System.out.println("Number of signs : " + sim);
    }

}
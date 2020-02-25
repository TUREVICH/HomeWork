package com.company;

public class ToLowerUpperCase {
    static String string = "fsadSDg";
    static char[][] alphabet = {{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'},
            {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}};
    static String stringUpp = "";
    static String stringLow = "";

    public static void main(String[] args) {

        toUpper();
        toLower();

    }

    public static void toUpper() {
        for (int k = 0; k < string.length(); k++) {
            for (int i = 0; i < alphabet.length; i++) {
                for (int j = 0; j < alphabet[i].length; j++) {

                    if (string.charAt(k) == alphabet[0][j]) {
                        stringUpp = stringUpp + alphabet[1][j];
                    } else if (string.charAt(k) == alphabet[1][j]) {
                        stringUpp = stringUpp + string.charAt(k);
                    }


                }
                break;
            }
        }
        System.out.println(stringUpp);

    }

    public static void toLower() {
        for (int k = 0; k < string.length(); k++) {
            for (int i = 0; i < alphabet.length; i++) {
                for (int j = 0; j < alphabet[i].length; j++) {

                    if (string.charAt(k) == alphabet[1][j]) {
                        stringLow = stringLow + alphabet[0][j];
                    } else if (string.charAt(k) == alphabet[0][j]) {
                        stringLow = stringLow + string.charAt(k);
                    }


                }
                break;
            }
        }
        System.out.println(stringLow);

    }


}


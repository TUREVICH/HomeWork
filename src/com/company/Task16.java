package com.company;

public class Task16 {

    public void task16(){
        int[] array = new int[7];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100));
            System.out.println(array[i]);
        }

        int a = array.length - 1;
        int temp;

        for (int i = 0; i < a; i++){
            temp = array[i]  ;
            array[i] = array[a];
            array[a] = temp;
            a--;
        }

        System.out.println("\n" + "new");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

package com.company;

public class Task14 {

    public void task14() {
        int[] array = new int[7];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100));
            System.out.println(array[i]);

            if (array[i] > max) {
                max = array[i];

            }
        }

        System.out.println("max mark : " + max);
    }

}

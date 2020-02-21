package com.company;

public class Task15 {

    public void task15() {
        int[] array = new int[7];
        int max = 0;
        int min = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100));
            System.out.println(array[i]);

            if (array[i] > array[max]) {
                max = i;
            }

            if (array[i] < array[min]) {
                min = i;
            }
        }

        System.out.println("Max : " + array[max] + "\n"+ "Min : " + array[min]);

        if (min < max) {
            for (int i = min + 1; i < max; ++i)
                sum += array[i];
        } else if (min > max) {
            for (int i = max + 1; i < min; ++i)
                sum += array[i];
        }

        System.out.println(sum);
    }

}

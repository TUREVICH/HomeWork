package com.company;

public class Task17 {

    public void task17(){
        int[][] array = new int[5][5];

        array[0][0] =1;
        array[1][0] =1;
        array[2][0] =1;
        array[3][0] =1;
        array[4][0] =1;
        array[0][1] =0;
        array[1][1] =1;
        array[2][1] =1;
        array[3][1] =1;
        array[4][1] =0;
        array[0][2] =0;
        array[1][2] =0;
        array[2][2] =1;
        array[3][2] =0;
        array[4][2] =0;
        array[0][3] =0;
        array[1][3] =1;
        array[2][3] =1;
        array[3][3] =1;
        array[4][3] =0;
        array[0][4] =1;
        array[1][4] =1;
        array[2][4] =1;
        array[3][4] =1;
        array[4][4] =1;

        for(int i = 0; i < array.length; ++i) {
            for(int j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j] + "\t");
            }

            System.out.println();
        }
    }
}

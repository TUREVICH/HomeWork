package com.company;

public class Task11 {
    public void task11() {
        int z = 3;
        boolean g = true;
        for(int i = 2; i < z; i++){
            if(z % i == 0){
                g = false;
            }
        }
        if (g) {
            System.out.println("prime number");
        }else {
            System.out.println("composite number");
        }
    }
}

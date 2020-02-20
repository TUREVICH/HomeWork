package com.company;

public class Cars {

    String name;
    int releaseDate;
    int tank;
    float consumption;
    Float distance;

    public void ride(){
        distance = (tank / consumption) * 100;
    }

}

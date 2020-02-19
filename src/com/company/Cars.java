package com.company;

public abstract class Cars {

    String name;
    int releaseDate;
    int tank;
    float consumption;
    Float distance;

    public void ride(){
        distance = (tank / consumption) * 100;
    }

}

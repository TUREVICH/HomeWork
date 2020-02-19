package com.company;

public class Golf extends Cars {

    public void golf(){
        name = "Golf";
        releaseDate = 2002;
        tank = 60;
        consumption = 5.5f;

        ride();
        System.out.println(name + " will pass :" + distance + " km.");
    }

}
package com.company;

public class Transporter extends Cars {

    public void transporter(){
        name = "Transporter";
        releaseDate = 2013;
        tank = 80;
        consumption = 8.6f;

        ride();
        System.out.println(name + " will pass :" + distance + " km.");
    }

}

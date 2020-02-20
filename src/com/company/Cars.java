package com.company;

public class Cars {

    private String name;
    private int releaseDate;
    private int tank;
    private float consumption;
    private Float distance;

    public void setTank(int tank) {
        this.tank = tank;
    }

    public void setConsumption(float consumption) {
        this.consumption = consumption;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getName() {
        return name;
    }

    public Float getDistance() {
        return distance;
    }

    public void ride(){
        distance = (tank / consumption) * 100;
    }



}

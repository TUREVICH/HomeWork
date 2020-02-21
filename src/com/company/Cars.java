package com.company;

public class Cars {

    private String name;
    private String releaseDate;
    private int tank;
    private float consumption;
    private Float distance;

    public void setTank(int tank) { this.tank = tank; }

    public void setConsumption(float consumption) {
        this.consumption = consumption;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        int releaseDateInt = Integer.parseInt(releaseDate);
        return releaseDateInt;
    }

    public String getName() {
        return name;
    }

    public Float getDistance() {
        return distance;
    }

    public void distanceCalculation(){
        distance = (tank / consumption) * 100;
    }



}

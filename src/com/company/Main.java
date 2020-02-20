package com.company;

public class Main {

    public static void main(String[] args) {
        Task8 task8 = new Task8();
        task8.task8();

        Task10 task10 = new Task10();
        task10.task10();

        Task11 task11 = new Task11();
        task11.task11();

        Cars golf = new Cars();
        Cars transporter = new Cars();

        golf.name = "Golf";
        golf.releaseDate = 2002;
        golf.tank = 60;
        golf.consumption = 5.5f;

        transporter.name = "Transporter";
        transporter.releaseDate = 2013;
        transporter.tank = 80;
        transporter.consumption = 8.6f;

        golf.ride();
        System.out.println(golf.name + " will pass :" + golf.distance + " km.");

        transporter.ride();
        System.out.println(transporter.name + " will pass :" + transporter.distance + " km.");


        System.out.println( golf.name + " release date : " + golf.releaseDate + "\n" + transporter.name + " release date : " + transporter.releaseDate);
        if (golf.releaseDate < transporter.releaseDate){
            System.out.println(golf.name + " older then " + transporter.name);
        }else {
            System.out.println(transporter.name + " older then " + golf.name);
        }
    }
}

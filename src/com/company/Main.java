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


        golf.setName("Golf");
        golf.setReleaseDate(2002);
        golf.setTank(60);
        golf.setConsumption(5.5f);

        transporter.setName("Transporter");
        transporter.setReleaseDate(2013);
        transporter.setTank(80);
        transporter.setConsumption(8.6f);

        golf.ride();
        System.out.println(golf.getName() + " will pass :" + golf.getDistance() + " km.");

        transporter.ride();
        System.out.println(transporter.getName() + " will pass :" + transporter.getDistance() + " km.");


        System.out.println( golf.getName() + " release date : " + golf.getReleaseDate() + "\n" + transporter.getName() + " release date : " + transporter.getReleaseDate());
        if (golf.getReleaseDate() < transporter.getReleaseDate()){
            System.out.println(golf.getName() + " older then " + transporter.getName());
        }else {
            System.out.println(transporter.getName() + " older then " + golf.getName());
        }
    }
}

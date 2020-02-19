package com.company;

public class Main {

    public static void main(String[] args) {
        Task8 task8 = new Task8();
        task8.task8();

        Task10 task10 = new Task10();
        task10.task10();

        Task11 task11 = new Task11();
        task11.task11();

        Golf golf = new Golf();
        Transporter transporter = new Transporter();

        golf.golf();
        transporter.transporter();

        System.out.println( golf.name + " release date : " + golf.releaseDate + "\n" + transporter.name + " release date : " + transporter.releaseDate);
        if (golf.releaseDate < transporter.releaseDate){
            System.out.println(golf.name + " older then " + transporter.name);
        }else {
            System.out.println(transporter.name + " older then " + golf.name);
        }
    }
}

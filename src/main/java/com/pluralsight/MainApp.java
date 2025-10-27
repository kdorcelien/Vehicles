package com.pluralsight;

import com.pluralsight.Autobots.Car;
import com.pluralsight.Autobots.Hovercraft;
import com.pluralsight.Autobots.Moped;
import com.pluralsight.Autobots.SemiTruck;

public class MainApp {
    public static void main(String[] args) {
        //String color, int numberOfPassengers, int cargoCapacity,
        // int fuelCapacity
        Moped sqweeks = new Moped("blue", 2, 4, 5);
        System.out.println(sqweeks.getColor());

       Car bumbleBee = new Car("Yellow",4, 7, 9 );


        SemiTruck optimusPrime = new SemiTruck("Red", 2, 20, 15);

        Hovercraft seaSpray = new Hovercraft("Purple", 2,10,11);
        seaSpray.setMotto("Be unyielding as the ocean waves and your enemies shall fall");
        seaSpray.getEquipment("Rs23");

    }
}

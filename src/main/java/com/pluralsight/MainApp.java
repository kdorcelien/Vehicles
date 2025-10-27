package com.pluralsight;

import com.pluralsight.VehicleType.Car;
import com.pluralsight.VehicleType.Hovercraft;
import com.pluralsight.VehicleType.Moped;
import com.pluralsight.VehicleType.SemiTruck;

public class MainApp {
    public static void main(String[] args) {
        Moped sqweeks = new Moped();
        sqweeks.setColor("Blue");
        sqweeks.setFuelCapacity(5);
        System.out.println(sqweeks.getColor());

       Car bumbleBee = new Car();
        bumbleBee.setColor("Yellow");
        bumbleBee.setFuelCapacity(9);

        SemiTruck optimusPrime = new SemiTruck();
        optimusPrime.setColor("Red");
        optimusPrime.setFuelCapacity(12);

        Hovercraft seaSpray = new Hovercraft();
        seaSpray.setColor("Purple");
        seaSpray.setFuelCapacity(10);

    }
}

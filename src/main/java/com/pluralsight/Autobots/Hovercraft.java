package com.pluralsight.Autobots;

import org.w3c.dom.ls.LSOutput;

public class Hovercraft extends Vehicle {
    private int cargoWeight;
    private String personality;
    private String equipment;
    private String motto;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }
//    @Override
//    public void transforming(){
//       super.transforming()

//    }

    public void tranformation(){
        System.out.println(super.transforming() + " Into a hovercraft, allowing for high speeds on water and limited movement on land. ");
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    @Override
    public String toString() {
        return "Hovercraft: " +
                "cargoWeight= " + cargoWeight +
                ", personality=  " + personality + '\'' +
                ", equipment= " + equipment + '\'' +
                ", motto= " + motto + '\'' +
                '}';
    }
}

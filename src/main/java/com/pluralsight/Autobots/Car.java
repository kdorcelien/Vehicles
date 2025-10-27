package com.pluralsight.Autobots;

public class Car extends Vehicle {
    private int numDoors;
    private boolean isAutobots;
    private String voiceModule;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }


    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isAutobots() {
        return isAutobots;
    }

    public void setAutobots(boolean autobots) {
        isAutobots = autobots;
    }

    public String getVoiceModule() {
        return voiceModule;
    }

    public void setVoiceModule(String voiceModule) {
        this.voiceModule = voiceModule;
    }
}

package com.pluralsight.Autobots;

public class SemiTruck extends Vehicle {
    private int trailerLength;
    private String leadership;
    private String abilities;
    private String catchphrase;


    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }
//@Override
//public void transforming(){
//      super.transforming();
//
//
//  }
    public int getTrailerLength() {
        return trailerLength;
    }

    public void setTrailerLength(int trailerLength) {
        this.trailerLength = trailerLength;
    }

    public String getLeadership() {
        return leadership;
    }

    public void setLeadership(String leadership) {
        this.leadership = leadership;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public String getCatchphrase() {
        return catchphrase;
    }

    public void setCatchphrase(String catchphrase) {
        this.catchphrase = catchphrase;
    }

    @Override
    public String toString() {
        return "SemiTruck: " +
                "trailerLength= " + trailerLength +
                ", leadership= " + leadership + '\'' +
                ", abilities= " + abilities + '\'' +
                ", catchphrase= " + catchphrase;
    }
}

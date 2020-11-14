package com.company;

public class Buses extends Vehicles implements Printable {
    private final String typeOfBus;

    public Buses(String waysOfMovement,
                 String yearsOfDiscoveries, String typeOfBus, String nameOrModel) {
        super(waysOfMovement, yearsOfDiscoveries, nameOrModel);
        this.typeOfBus = typeOfBus;
    }

    public String getTypeOfBus() {
        return typeOfBus;
    }

    @Override
    public void print() {
        System.out.println("__________\nVehicle Name: " + getNameOrModel() + "\nDiscovered Year: " + getYearsOfDiscoveries()
                +"\nMovement Way: " + getWaysOfMovement() + "\nType: " + getTypeOfBus());

    }
}

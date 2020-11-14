package com.company;

public class Bicycles extends Vehicles implements Printable {
    private String typeOfBicycle;

    public Bicycles(String waysOfMovement,
                    String yearsOfDiscoveries, String typeOfBicycle, String nameOrModel) {
        super(waysOfMovement, yearsOfDiscoveries, nameOrModel);
        this.typeOfBicycle = typeOfBicycle;
    }

    public String getTypeOfBicycle() {
        return typeOfBicycle;
    }

    @Override
    public void print() {
        System.out.println("__________\nVehicle Name: " + getNameOrModel() + "\nDiscovered Year: " + getYearsOfDiscoveries()
                + "\nMovement Way: " + getWaysOfMovement() + "\nType: " + getTypeOfBicycle());

    }
}

package com.company;

public class CargoVehicles extends Vehicles implements Printable {
    private String waysToUse;

    public CargoVehicles(String waysOfMovement,
                         String yearsOfDiscoveries, String waysToUse, String nameOrModel) {
        super(waysOfMovement, yearsOfDiscoveries, nameOrModel);
        this.waysToUse = waysToUse;
    }

    public String getWaysToUse() {
        return waysToUse;
    }

    @Override
    public void print() {
        System.out.println("__________\nVehicle Name: " + getNameOrModel() + "\nDiscovered Year: " +
                getYearsOfDiscoveries() + "\nMovement Way: " + getWaysOfMovement() +
                "\nWays To Use: " + getWaysToUse());

    }
}

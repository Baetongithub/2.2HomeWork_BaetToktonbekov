package com.company;

public class Cars extends Vehicles implements Printable {
    private String engineTypes;
    private double engineVolume;

    public Cars(String waysOfMovement, String yearsOfDiscoveries,
                String engineTypes, double engineVolume, String nameOrModel) {
        super(waysOfMovement, yearsOfDiscoveries, nameOrModel);
        this.engineTypes = engineTypes;
        this.engineVolume = engineVolume;
    }

    public String getEngineTypes() {
        return engineTypes;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public void print() {
        System.out.println("__________\nVehicle Name: " + getNameOrModel() + "\nDiscovered Year: " + getYearsOfDiscoveries() +
                "\nMovement Way: " + getWaysOfMovement() + "\nEngine Type: " + getEngineTypes() +
                "\nEngine Volume: " + getEngineVolume());

    }
}

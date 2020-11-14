package com.company;

public class Vehicles {
    private String waysOfMovement;
    private String yearsOfDiscoveries;
    private String nameOrModel;


    public Vehicles(String waysOfMovement, String yearsOfDiscoveries, String nameOrModel) {
        this.waysOfMovement = waysOfMovement;
        this.yearsOfDiscoveries = yearsOfDiscoveries;
        this.nameOrModel = nameOrModel;
    }

    public String getNameOrModel() {
        return nameOrModel;
    }

    public String getWaysOfMovement() {
        return waysOfMovement;
    }

    public String getYearsOfDiscoveries() {
        return yearsOfDiscoveries;
    }
}

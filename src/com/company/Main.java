package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(createObject("Toyota"));
        System.out.println(createObject("Volvo"));
        System.out.println(createObject("School bus"));
        System.out.println(createObject("Bike for city riding"));

    }

    public static String createObject(String className) {

        Cars toyota = new Cars("With Internal Combustion Engine", "1982 - y",
                "Internal Combustion Engine", 2.5, "Camry");
        CargoVehicles volvo = new CargoVehicles("With Internal Combustion Engine",
                "1993 - y.", "For Long-Distance Transportation", "Volvo FH");
        Buses schoolBus = new Buses("Take Schoolchildren To School", "Мid 20th Сentury",
                "School Bus", "Blue Bird Conventional");
        Bicycles forCityRiding = new Bicycles("By Schrolling Pedals With Human's Feet",
                "Mid 19th Century", "For City Riding", "Rover");

        switch (className) {
            case "Toyota" -> toyota.print();
            case "Volvo" -> volvo.print();
            case "School bus" -> schoolBus.print();
            case "Bike for city riding" -> forCityRiding.print();
        }
        return className;
    }

    //Vehicles createObject = switch (String className)
}


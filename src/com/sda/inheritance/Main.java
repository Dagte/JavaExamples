package com.sda.inheritance;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Car newCar = new Car();
        newCar.setFuelType(FuelType.GASOLINE);
        newCar.setManual(true);
        newCar.setColour(Colour.GREEN);
        newCar.setManufacturer("SEAT");
        newCar.setModel("Tarraco");
        newCar.setSeatNumber(5);
        newCar.setYear(2019);
        newCar.setMaxSpeed(201);

        Bus newBus = new Bus();
        newBus.setFuelType(FuelType.DIESEL);
        newBus.setManual(false);
        newBus.setColour(Colour.WHITE);
        newBus.setManufacturer("Fiat");
        newBus.setModel("Transit");
        newBus.setSeatNumber(10);
        newBus.setYear(2017);
        newBus.setNumberOfPassengers(BigDecimal.valueOf(50));

        Motorbike newBike = new Motorbike();
        newBike.setColour(Colour.RED);
        newBike.setManufacturer("Ducati");
        newBike.setModel("Panigale V2");
        newBike.setSeatNumber(1);
        newBike.setYear(2017);

        Vehicle vehicle = newBus;
        Car carVehicle = newCar;
        Bus busVehicle = newBus;
        Vehicle motorbikeVehicle = newBike;
        System.out.println(carVehicle.toString());
        System.out.println(carVehicle.calculateAge());

        System.out.println(busVehicle.toString());
        System.out.println(busVehicle.calculateAge());
//        System.out.println(vehicle.toString());
//        System.out.println(motorbikeVehicle.toString());

        carVehicle.startEngine();
        carVehicle.stopEngine();
        carVehicle.changeGear();
        carVehicle.startEngine();
        carVehicle.changeGear();

//        final Integer gear = carVehicle.changeGear();

       final Integer maxSpeed = carVehicle.getMaxSpeed();
        System.out.println(" car gear is set to: " +  carVehicle.getGear());
        System.out.println(" car maximum speed is: " +  maxSpeed);

        carVehicle.decideTypeOfVehicle();

    }
}

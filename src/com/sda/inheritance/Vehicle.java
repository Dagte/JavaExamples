package com.sda.inheritance;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter(AccessLevel.PUBLIC)
@ToString
public abstract class Vehicle implements VehicleInterface { //adding the keyword "abstract" before class
    // we make the class an abstract class


    protected Boolean isEngineRunning;
    private Integer year;
    private Colour colour;
    private Integer seatNumber;
    private String manufacturer;
    private String model;
    private Integer maxSpeed;
    private Integer gear = 0;



    @Override
    public Integer calculateAge() {
        return LocalDate.now().minusYears(this.year).getYear();
    }

    @Override
    public void startEngine() {
        System.out.println("Engine has started");
        this.isEngineRunning = true;
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine has stopped");
        this.isEngineRunning = false;
    }


    public Integer getGear() {
        return this.gear;
    }

    @Override
    public void changeGear() {
        if (isEngineRunning) {
            ++this.gear;
            System.out.println("Car gear is set to: " + this.gear);
        } else {
            System.out.println("Engine is not running!");
        }
    }

    @Override
    public Integer getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public Integer availabilityInStock() {
        return null;
    }

    public abstract void decideTypeOfVehicle();
}

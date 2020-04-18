package com.sda.inheritance;

import java.time.LocalDate;

public abstract class Vehicle implements VehicleInterface { //adding the keyword "abstract" before class
    // we make the class an abstract class

    private Integer year;
    private Colour colour;
    private Integer seatNumber;
    private String manufacturer;
    private String model;
    private Integer maxSpeed;
    private Integer gear = 0;
    protected Boolean isEngineRunning;

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    protected Integer getYear() {
        return year;
    }

    protected void setYear(Integer year) {
        this.year = year;
    }

    protected Colour getColour() {
        return colour;
    }

    protected void setColour(Colour colour) {
        this.colour = colour;
    }

    protected Integer getSeatNumber() {
        return seatNumber;
    }

    protected void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    protected String getManufacturer() {
        return manufacturer;
    }

    protected void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    protected String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "This is a Vehicle: {" +
                "year=" + year +
                ", colour='" + colour + '\'' +
                ", Number of seats: =" + seatNumber +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public Integer calculateAge() {
      return  LocalDate.now().minusYears(this.year).getYear();
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
        System.out.println("Car gear is set to: " +  this.gear);
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

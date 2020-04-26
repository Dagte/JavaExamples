package com.sda.inheritance;


public class Car extends CarrierVehicle {

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("This is a Car{");
        sb.append(" This is a carrier Vehicle {" +  super.toString() + "}");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine has started");
        this.isEngineRunning = true;
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine has stopped running");
        this.isEngineRunning = false;}
}

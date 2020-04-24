package com.sda.generics;

public class Truck extends AbstractVehicle implements Comparable<Truck> {

    private String truckName;

    public String getTruckName() {
        return truckName;
    }

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    @Override
    public void repair() {
        System.out.println("Truck is repaired: ");
    }

    @Override
    public void compareTo(final Truck otherObject) {
        if (this.truckName.equalsIgnoreCase(otherObject.getTruckName())) {
            System.out.println("Trucks have the same name: " + truckName + " = " + otherObject.getTruckName());
        } else {
            System.out.println("Trucks have not the same name: " + truckName + " is not: " + otherObject.getTruckName());

        }
        int speedDiff = this.maxSpeed - otherObject.maxSpeed;
        if (speedDiff > 0) {
            System.out.println("your truck is faster");
        } else if (speedDiff == 0) {
            System.out.println("Both trucks have same speed");
        } else {
            System.out.println("other truck is faster");
        }
    }

    @Override
    public void garbage() {
        System.out.println("Your truck is garbage!");;
    }
}

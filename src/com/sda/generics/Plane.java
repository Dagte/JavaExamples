package com.sda.generics;

public class Plane extends AbstractVehicle implements Comparable<Plane> {

    @Override
    public void compareTo(final Plane otherPlane) {
        int speedDiff = this.maxSpeed - otherPlane.maxSpeed;
        if (speedDiff > 0) {
            System.out.println("your plane is faster");
        } else if (speedDiff == 0) {
                System.out.println("Both planes have same speed");
            } else {
                System.out.println("other plane is faster");
            }

    }

    @Override
    public void repair() {
        System.out.println("Plane is repaired: ");
    }
}

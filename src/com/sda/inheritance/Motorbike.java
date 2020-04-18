package com.sda.inheritance;

public class Motorbike extends Vehicle {

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("This is a Motorbike{");
        sb.append(" Vehicle {" +  super.toString() + "}");
        sb.append('}');
        return sb.toString();
    }

    @Override
        public void decideTypeOfVehicle() {
            if (this.getSeatNumber() < 2) {
                System.out.println("This is not a family vehicle");
            }

    }
}


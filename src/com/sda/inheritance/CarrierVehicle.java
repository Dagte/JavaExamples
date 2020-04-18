package com.sda.inheritance;

public class CarrierVehicle extends Vehicle {

    private FuelType fuelType;
    private boolean isManual;

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("This is a CarrierVehicle{");
        sb.append("fuelType=' name: ").append(fuelType.getName()).append(" | Price: ").append(fuelType.getPrice()).append('\'');
        sb.append(", isManual=").append(isManual);
        sb.append(" Vehicle {" +  super.toString() + "}");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void decideTypeOfVehicle() {
        if (this.getSeatNumber() < 2) {
            System.out.println("This is not a family vehicle");
        } else if (this.getSeatNumber() > 5) {
            System.out.println("This is a public transport vehicle");
        } else if (this.getSeatNumber() >= 2 && this.getSeatNumber() <= 5) {
            System.out.println("This is a family vehicle");
        }

    }
}

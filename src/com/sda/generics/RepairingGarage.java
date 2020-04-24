package com.sda.generics;

public class RepairingGarage<T extends AbstractVehicle> {

    private T vehicle;

    public RepairingGarage(T vehicle) {
        this.vehicle = vehicle;
    }

    public void repairMyVehicle() {
        vehicle.repair();
    }
}

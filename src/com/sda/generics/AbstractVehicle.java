package com.sda.generics;

public abstract class AbstractVehicle { // todo try to implement a comparison also with abstract class

    public abstract void repair();
    protected  int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public void garbage() {
        System.out.println("Your vehicle can't possible be repaired");
    }
}

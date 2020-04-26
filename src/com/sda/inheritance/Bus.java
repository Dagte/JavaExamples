package com.sda.inheritance;

import lombok.ToString;

import java.math.BigDecimal;


@ToString
public class Bus extends  CarrierVehicle {

    private BigDecimal numberOfPassengers;

    public BigDecimal getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(BigDecimal numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }


}

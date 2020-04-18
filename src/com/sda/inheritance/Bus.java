package com.sda.inheritance;

import java.math.BigDecimal;

public class Bus extends  CarrierVehicle {

    private BigDecimal numberOfPassengers;

    public BigDecimal getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(BigDecimal numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("This is a Bus{");
        sb.append("numberOfPassengers=").append(numberOfPassengers);
        sb.append('}');
        sb.append(" This is a carrier Vehicle {" +  super.toString() + "}");
        return sb.toString();
    }
}

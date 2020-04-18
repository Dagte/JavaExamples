package com.sda.inheritance;

import java.math.BigDecimal;

public enum FuelType {
    DIESEL ( "Diesel",  BigDecimal.valueOf(1.10)),
    GASOLINE( "Gasoline",  BigDecimal.valueOf(2.15)),
    HYBRID( "Hybrid",  BigDecimal.valueOf(1.70)),
    ELECTRICITY( "Electricity",  BigDecimal.valueOf(0.50));

    private String name;
    private BigDecimal price;

    FuelType(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

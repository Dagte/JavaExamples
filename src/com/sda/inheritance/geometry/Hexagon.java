package com.sda.inheritance.geometry;

public class Hexagon extends Polygon {

    private Integer sideLength;

    public Integer getSideLength() {
        return this.sideLength;
    }

    public void setSideLength(Integer sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return 2.598 * this.sideLength * this.sideLength;
    }
}

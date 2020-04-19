package com.sda.inheritance.geometry;

public class RoundShape extends Shape {

    private int majorRadius;
    private int minorRadius;

    @Override
    public double getPerimeter() {
        return 0;
    }

    protected int getMajorRadius() {
        return majorRadius;
    }

    protected void setMajorRadius(int majorRadius) {
        this.majorRadius = majorRadius;
    }

    protected int getMinorRadius() {
        return minorRadius;
    }

    protected void setMinorRadius(int minorRadius) {
        this.minorRadius = minorRadius;
    }

    @Override
    public double getArea() {
        return 0;
    }
}

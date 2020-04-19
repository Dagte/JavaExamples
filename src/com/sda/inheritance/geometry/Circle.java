package com.sda.inheritance.geometry;

public class Circle extends RoundShape {
    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getMajorRadius() * getMinorRadius() * Math.PI;
    }
}

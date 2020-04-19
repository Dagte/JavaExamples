package com.sda.inheritance.geometry;

public class Rectangle extends Polygon {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.a + this.b);
    }

    @Override
    public double getArea() {
        return this.a * this.b;
    }
}

package com.sda.inheritance.geometry;

public class Triangle extends Polygon {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
//    public int getC() {
//        return c;
//    }

    public void setC(int c) {
        this.c = c;
    }

//    public int getA() {
//        return a;
//    }

    public void setA(int a) {
        this.a = a;
    }

//    public int getB() {
//        return b;
//    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    @Override
    public double getArea() {
        double semiper = getPerimeter()/2;
        return Math.sqrt((semiper) * (semiper - a) * (semiper - b) * (semiper - c));
    }
}

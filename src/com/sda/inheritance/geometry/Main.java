package com.sda.inheritance.geometry;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,2);
        Triangle triangle = new Triangle(5,6 ,7 );
        Circle circle = new Circle();

        Hexagon hexagon1 = new Hexagon();

        Polygon pol = hexagon1;
        Object obj = hexagon1;
        Shape sha = hexagon1;

        hexagon1.setNumberOfSides(6);
        hexagon1.setSideLength(2);
        triangle.setNumberOfSides(3);
        rectangle.setNumberOfSides(4);

        circle.setMajorRadius(5);
        circle.setMinorRadius(5);


        System.out.println(circle.getArea());
        System.out.println(triangle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(hexagon1.getArea());
        System.out.println(hexagon1.getPerimeter());

    }
}

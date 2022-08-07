package com.timbuchalka;

public class Circle {
    private double radius;

    //@constructor
    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}

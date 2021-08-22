package com.timbuchalka;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
        if (width < 0) {
            this.width = 0;
        }
    }

    public void setLength(double length) {
        this.length = length;
        if (length < 0) {
            this.length = 0;
        }
    }

    public double getArea() {
        return width * length;
    }
}

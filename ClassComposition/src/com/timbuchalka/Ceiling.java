package com.timbuchalka;

public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }
    public int getheight() {
        return height;
    }
    public int getPaintedColor() {
        return paintedColor;
    }
}
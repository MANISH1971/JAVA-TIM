package com.timbuchalka;

public class Bed {
    private String style;
    private int pellows;
    private int height;
    private int sheets;
    private int quilt;

    // Constructor
    public Bed(String style, int pellows, int height, int sheets, int quilt) {
        this.style = style;
        this.pellows = pellows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("Bed -> Making");
    }

    // getters
    public String getStyle() {
        return style;
    }

    public int getPellows() {
        return pellows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}

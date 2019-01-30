package com.cmput301_project;

public abstract class Circle {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x,y);
        this.radius = radius;
    }

    public Circle(int x, int y) {
        super(x,y);
    }

    public Circle() {
        super();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

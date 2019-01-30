package com.cmput301_project;

public class Square extends Shape{
    public Square(int x, int y) {
        super(x, y);
    }

    public Square(int x, int y, int length) {
        super(x, y);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int length;
}

package com.workintech.pool;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width < 0 ? 0 : width;
    }

    public int getLength() {
        return length;
    }

    public int getArea() {
        return width * length;
    }
}
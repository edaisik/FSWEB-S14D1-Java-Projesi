package com.workintech.pool;

public class Cuboid extends Rectangle {
    private int height;

    public Cuboid(int width, int length, int height) {
        super(width, length);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return super.getArea() * height;
    }
}
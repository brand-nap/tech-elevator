package com.techelevator;

public class TriangleWall extends Wall{
    private int height;
    private int base;

    public TriangleWall(String name, String color, int base, int height) {
        super(name, color);
        this.height = height;
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public int getBase() {
        return base;
    }

    @Override
    public int getArea() {
        return (int) (height*base*.5);
    }
    public String toString(){
        return super.getName() + " (" + base + "x" + height + ") triangle";
    }
}

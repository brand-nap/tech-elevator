package com.techelevator;

public class RectangleWall extends Wall{

    private int height;
    private int length;

    public RectangleWall(String name, String color,  int length, int height) {
        super(name, color);
        this.height = height;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }



    @Override
    public int getArea() {
        return height*length;
    }

    public String toString(){
        return super.getName() + " (" + length + "x" + height + ") rectangle";
    }
}

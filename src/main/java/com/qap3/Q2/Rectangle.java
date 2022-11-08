package com.qap3.Q2;

public class Rectangle extends Shape {

    private double width;
    private double length;

    //Constructors

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String colour, boolean filled) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }


    //Getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    //Setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (width * length);
    }

    @Override
    public double getPerimeter() {
        return (2 * (length * width));
    }

    @Override
    public void show() {
        System.out.println();
        System.out.println("The Area of the Rectangle is :" + super.formatNumber(getArea()));
        System.out.println("The Perimeter of the Rectangle is : " + super.formatNumber(getPerimeter()));
    }

    @Override
    public String toString() {
        return ("Rectangle" + " " + super.toString() + " the length is " + this.length + " and the width is " + this.width);

    }
}

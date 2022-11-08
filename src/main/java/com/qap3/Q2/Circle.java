package com.qap3.Q2;

public class Circle  extends Shape{

    private double radius;

    //Constructors

    public Circle(){
        super();
        this.radius =1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String colour, boolean filled, double radius) {
        super(colour, filled);
        this.radius = radius;
    }

    //Getters
    public double getRadius() {
        return radius;
    }

    //Setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override

    public void show(){
        System.out.println();
        System.out.println("The Area of the Circle is :" + super.formatNumber(getArea()));
        System.out.println("The Perimeter of the Circle is : " +  super.formatNumber(getPerimeter()));
    }

    //Methods

    @Override
    public double getArea(){
        return(Math.PI * (Math.pow(radius,2)));
    }

    @Override
    public double getPerimeter(){
        return(2*Math.PI*radius);
    }

    @Override
    public String toString(){
        return("Circle: " + " " + super.toString() + " with a radius of  " + this.radius);
    }
}

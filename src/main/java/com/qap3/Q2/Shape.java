package com.qap3.Q2;

import java.util.Formatter;

public  abstract class Shape {

    private String colour;
    boolean filled;

    // Constructors
    public Shape(){
        this.colour = "Red";
        this.filled = false;
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    // Getters

    public String getColour() {
        return colour;
    }

    public boolean isFilled() {
        return filled;
    }

    //Setters

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String formatNumber(double value){
        Formatter formatter = new Formatter();
        return String.valueOf((formatter.format("%.2f", value)));
    }


    // abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();

    public abstract void show();
    @Override
    public String toString(){
        return("Colour: " + this.colour + " is Filled " + filled);
    }
}

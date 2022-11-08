package com.qap3.Q2;

import java.util.Formatter;

public  abstract class Shape {

    private String colour;
    boolean filled;

    String stringFilled;

    // Constructors
    public Shape(){
        this.colour = "Green";
        setFilled(true);
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        setFilled(filled);
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
        stringFilled();
    }

    public void stringFilled(){
        if(isFilled()){
            this.stringFilled = "is filled";
        }else{
            this.stringFilled = " is not filled";
        }
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
        return("Colour is  " + this.colour +  " the shape " + this.stringFilled);
    }
}

package com.qap3.Q2;

public class Square extends Rectangle{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String colour, boolean filled){
        this.side = side;
        super.setColour(colour);
        super.setFilled(filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }

    @Override

    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public double getArea(){
        return( side * side);
    }

    @Override
    public double getPerimeter(){
        return(4*side);
    }

    @Override

    public void show(){
        System.out.println();
        System.out.println("The Area of the Square is : " +  super.formatNumber(getArea()));
        System.out.println("The Perimeter of the Square is : " +  super.formatNumber(getPerimeter()));
    }



    @Override
    public String toString(){
        return("Square :" +  " Colour is " + super.getColour()  + " Shape is Filled " + super.isFilled() + " has a side value of " + side);
    }
}

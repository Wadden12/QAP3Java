package com.qap3.Q2;

public class TestShape {


    public static void main(String[] args){
        Circle circle1 = new Circle("Red ",true,5);
        System.out.println(circle1);
        circle1.show();
        System.out.println("The Colour of the circle is  " + circle1.getColour());
        System.out.println("The Radius od the Circle is " + circle1.getRadius());
        circle1.setRadius(10);
        System.out.println();
        System.out.println("New Radius is " + circle1.getRadius());
        System.out.println(circle1);
        circle1.show();
        System.out.println("Rectangle");
        Rectangle rectangle1 = new Rectangle(30, 25, "Blue" , true);
        System.out.println(rectangle1);
        rectangle1.show();
        System.out.println();
        System.out.println("Square");
        Square square1 = new Square(5,"Green", true);
        System.out.println(square1);
        square1.show();
        System.out.println("Exercise questions");

        Circle s1 = new Circle("Red", false, 5.5);
        System.out.println(s1);
        s1.show();
        System.out.println("Colour :" + s1.getColour());
        System.out.println("Filled :" + s1.isFilled());
        System.out.println("You can't access getRaidus because its not part of shape");

        Circle c1;
        c1 = s1;

        System.out.println(c1);
        c1.show();
        System.out.println("Colour " + c1.getColour());
        System.out.println("Filled: " + c1.isFilled());
        System.out.println("Radius " + c1.getRadius());

        System.out.println("Cannot make a new Shape object because it is abstract");

        Rectangle s3 = new Rectangle(1.0, 2.0, "Red", false);

        System.out.println(s3);
        s3.show();
        System.out.println("Colour: " + s3.getColour());
        System.out.println("Filled: " + s3.isFilled());
        System.out.println("Get Length will not work because its not a method of the shape class");

        Rectangle r1;
        r1 = s3;

        System.out.println(r1);
        r1.show();
        System.out.println("Colour: " + r1.getColour());
        System.out.println("Filled: " + r1.isFilled());
        System.out.println("Length: " + r1.getLength());


        System.out.println();
        Rectangle s4 = new Square(6.6);
        System.out.println(s4);
        s4.show();
        System.out.println("Colour" + s4.getColour());
        System.out.println("Cannot get side get side is not part of shape method");
        Rectangle r2;
        r2 = s4;

        System.out.println(r2);
        r2.show();
        System.out.println("Colour :" + r2.getColour());

    }
}

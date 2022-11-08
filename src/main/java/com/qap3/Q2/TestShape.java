package com.qap3.Q2;

public class TestShape {


    public static void main(String[] args){
        Circle c1 = new Circle("Red", true, 5.0);
        System.out.println(c1);
        c1.show();
        Circle c2 = new Circle("blue", true, 5.0);
        System.out.println();
        System.out.println(c2);
        c2.show();
        Rectangle r1 = new Rectangle(2.0, 3.0);
        System.out.println();
        System.out.println(r1);
        r1.show();

        Rectangle r2 = new Rectangle(2.0, 3.0, "green", false);
        System.out.println();
        System.out.println(r2);
        r2.show();

        Square sq = new Square(4.0);
        System.out.println();
        System.out.println(sq);
        sq.show();

        Square sq1 = new Square(4.0, "yellow", true);
        System.out.println();
        System.out.println(sq1);
        sq1.show();
    }
}

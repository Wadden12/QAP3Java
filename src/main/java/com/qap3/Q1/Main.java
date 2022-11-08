package com.qap3.Q1;

public class Main {

    public static void main(String[]args){

        Person mike = new Person("Mike Cola", 38, "M");


        System.out.println(mike);
        System.out.println();
        Student jenny = new Student("Jenny Jones", 20, "F", "J33JWJ", 3.5);
        System.out.println(jenny);
        System.out.println();
        Teacher alex = new Teacher("Alex Base", 45, "M", Subject.COMPUTER_SCIENCE, 75_000);
        System.out.println(alex);
        System.out.println();
        CollegeStudent james = new CollegeStudent("James O'Brien", 18, "M", "AB1ABA", 1.0,  Subject.SCIENCE, 1 );
        System.out.println(james);
    }
}

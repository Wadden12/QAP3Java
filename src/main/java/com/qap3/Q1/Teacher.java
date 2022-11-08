package com.qap3.Q1;

import java.text.NumberFormat;
import java.util.Locale;

public class Teacher extends Person{

    private Subject subject;
    private double salary;

    // Constructors

    public Teacher(String myName, int myAge, String myGender, Subject subject, double salary) {
        super(myName, myAge, myGender);
        this.subject = subject;
        this.salary = salary;
    }

    //Getters

    public Subject getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    //Setter


    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        NumberFormat nf
                = NumberFormat.getInstance(Locale.CANADA);
        return(super.toString() +  " Teacher: Subject: " + this.subject + " Salary: $" + nf.format(this.salary));
    }

}

package com.qap3.Q1;

public class Person {

    protected  String myName;
    protected int myAge;
    protected String myGender;

    // Constructors

    public Person(String myName, int myAge, String myGender) {
        setMyName(myName);
        setMyAge(myAge);
        setMyGender(myGender);
    }

    // Getters

    public String getMyName() {
        return myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    //Setters

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    @Override
    public String toString(){
        return(this.myName + " age: " + this.myAge + " gender: " + myGender);
    }
}

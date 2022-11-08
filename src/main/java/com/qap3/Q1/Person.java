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

    public Person(String myName, int myAge) {
        this.myName = myName;
        this.myAge = myAge;
        this.myGender = "undefined";
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
        if(myAge < 5){
            try {
                throw new AgeException("Incorrect age entered must be older than 5");
            } catch (AgeException e) {
                throw new RuntimeException(e);
            }
        }
        this.myAge = myAge;
    }

    public void setMyGender(String myGender) {
        if (myGender.toUpperCase().equals("M") || myGender.toUpperCase().equals("F")) {
            this.myGender = myGender;
        } else
            System.out.println("Invalid Entry: Please or (M) Male or (F) Female.");
    }

    @Override
    public String toString(){
        return(this.myName + " Age: " + this.myAge + " Gender: " + myGender);
    }
}

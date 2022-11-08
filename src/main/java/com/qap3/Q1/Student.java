package com.qap3.Q1;

public class Student extends Person{

    protected String myIdNum;
    protected  double myGPA;

    // Constructor

    public Student(String myName, int myAge, String myGender, String myIdNum, double myGPA) {
        super(myName, myAge, myGender);
        setMyIdNum(myIdNum);
      setMyGPA(myGPA);
    }

    //Setters


    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    //Getters

    public String getMyIdNum() {
        return myIdNum;
    }

    public double getMyGPA() {
        return myGPA;
    }

    @Override

    public String toString(){
        return(super.toString() + " ID Number: " + this.myIdNum + "GPA: " + this.myGPA);
    }
}

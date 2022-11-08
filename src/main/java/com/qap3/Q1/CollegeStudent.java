package com.qap3.Q1;

public class CollegeStudent extends Student {

    private Subject major;
    private int year;
    private String stringYear;

    //Constructor


    public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, Subject major, int year) {
        super(myName, myAge, myGender, myIdNum, myGPA);
        setYear(year);
      setMajor(major);
    }


    public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA,  int year) {
        super(myName, myAge, myGender, myIdNum, myGPA);
        this.major = Subject.UNDECLARED;
        setYear(year);

    }

    // Getters

    public Subject getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }


    public String getStringYear(){
        return stringYear;
    }

    //Setters
    @Override
    public void setMyAge(int age){
        if(age < 18){
            try {
                throw new AgeException("Invalid Age a College student must be older than 18");
            } catch (AgeException e) {
                throw new RuntimeException(e);
            }

        } else{
            super.setMyAge(age);
        }

    }


    public void setMajor(Subject major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
        setStringYear();
    }

    // sets up the string update for year
    private void  setStringYear(){
       switch(getYear()){
           case 1 -> this.stringYear =  "Freshmen";
           case 2 -> this.stringYear = "Sophomore";
           case 3 -> this.stringYear = "Junior";
           case 4 -> this.stringYear = "Senior";
           default -> {
               System.out.println("Invalid enter a number between 1 and 4");
               System.out.println();
           }
    }
    }

    public String toString(){
        return( super.toString() + " Major: " + this.major + " Year " + this.stringYear);
    }


}

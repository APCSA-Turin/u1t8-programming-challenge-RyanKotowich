package com.example.project;

public class Student {
    // INSTANCE VARIABLES (private)
    // first name (String)
    private String firstName;
    // last name (String)
    private String lastName;
    // graduation year (int)
    private int gradYear;
    // sum of test scores (double).. should initialize at 0.0
    private double accumulatedTestScores = 0.0;
    // test score count (int) ..should initialize at 0
    private int testScoreCount = 0;
    // highest test score (double).. should initialize at 0.0
    private double highestTestScore = 0.0;
 
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        //implement code here!
this.firstName = firstName;
this.lastName = lastName;
this.gradYear = gradYear;
    }
 
    // returns firstName
    public String getFirstName() {

        //implement code here!
        return this.firstName;
    }
 
    // returns lastName
    public String getLastName() {
        //implement code here!
        return this.lastName;
    }
 
    public double getHighestTestScore() {
        //implement code here!
        return this.highestTestScore;
    }

    public int getTestScoreCount(){
        //implement code here!
        return this.testScoreCount;

    }

    public int getGradYear(){
        //implement code here!
        return this.gradYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
        //implement code here!
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        
        //implement code here!
        accumulatedTestScores += newTestScore;
        testScoreCount ++;
        if (newTestScore > highestTestScore) {
            highestTestScore = newTestScore;
        }
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        //implement code here!
        if (averageTestScore() >= 65) {
            return true;
        } else {
            return false;
        }
        }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        //implement code here!
        if (testScoreCount == 0) {
            return 0.0;
        }
        return accumulatedTestScores / testScoreCount;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " + firstName + " " + lastName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Number of tests: " + testScoreCount);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println("Highest Test Score: " + highestTestScore);
        System.out.println("Is passing: " + isPassing());
    }
 }
 
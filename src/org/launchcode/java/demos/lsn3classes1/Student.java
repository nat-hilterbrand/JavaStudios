package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {
    Scanner input = new Scanner(System.in);

    private String name;
    private int studentId;
    private int numberOfCredits;
    private Double gpa;
    private String nextInput;


    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setStudentId(int newStudentId) {
        studentId = newStudentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public Double getGpa() {
        return gpa;
    }

    public String getNextInput() {
        return nextInput;
    }

    public void setNextInput(String aNextInput) {
        nextInput = aNextInput;
    }


    public void buildStudent() {

            ArrayList studentInfo = new ArrayList();

            System.out.println("Enter the student's name: ");
            this.setName(input.nextLine());

            System.out.println("Enter the student's Id: ");
            this.setStudentId(input.nextInt());

            System.out.println("Enter the number of credits: ");
            this.setNumberOfCredits(input.nextInt());

            System.out.println("Enter the student's gpa: ");
            this.setGpa(input.nextDouble());

            studentInfo.add(this.name);
            studentInfo.add(this.studentId);
            studentInfo.add(this.numberOfCredits);
            studentInfo.add(this.gpa);

    }
}


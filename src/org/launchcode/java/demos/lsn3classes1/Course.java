package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Course {
    Scanner input = new Scanner(System.in);
    public String courseTeacher;
    public String courseSubject;
    public String attendance;
    private ArrayList<String> courseRoster;
    private HashMap<String, String> studentAttendance;

    public void setCourseTeacher(String aCourseTeacher){
        courseTeacher = aCourseTeacher;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseSubject(String aCourseSubject) {
        courseSubject = aCourseSubject;
    }

    public String getCourseSubject() {
        return courseSubject;
    }

    public void setAttendance(String newAttendance) {
        attendance = newAttendance;
    }

    public String getAttendance(){
        return attendance;
    }
    public void setCourseRoster(ArrayList aCourseRoster){
        courseRoster = aCourseRoster;
    }

    public ArrayList getCourseRoster() {
        return courseRoster;
    }

    public void setStudentAttendance(HashMap aStudentAttendance) {
        studentAttendance = aStudentAttendance;
    }

    public HashMap getStudentAttendance(){
        return studentAttendance;
    }


    public void addTeacher(Teacher teacher){
        this.setCourseTeacher(teacher.getLastName());
    }

    public void addSubject(Teacher teacher) {
            this.setCourseSubject(teacher.getSubject());
    }

    public void buildCourseRoster(ArrayList<Student> students) {
            ArrayList<String> newCourseRoster = new ArrayList<>();
           for(Student student : students) {
               newCourseRoster.add(student.getName());
           }
           this.setCourseRoster(newCourseRoster);
    }


    public void addCourseAttendance(ArrayList<Student> students){
            HashMap<String,String> newCourseAttendance = new HashMap<>();
            for(Student student: students) {
                newCourseAttendance.put(student.getName(), this.attendance);
            }
            this.setStudentAttendance(newCourseAttendance);

    }

    public void buildCourseAttendance() {
        String student = "";
        ArrayList<String> studentNames = new ArrayList<>();
        for(int i=0; i< courseRoster.size(); i++){
            student = courseRoster.get(i);
            studentNames.add(student);
            System.out.println("Did " + student +" attend class today?");
            this.setAttendance(input.nextLine());
        }

    }
}
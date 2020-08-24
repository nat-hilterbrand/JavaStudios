package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> enteredStudents = new ArrayList<>();

        System.out.println("Would you like to enter a student?");
        String nextInput = input.nextLine().toLowerCase();
        while(nextInput.equals("yes")){
            Student student = new Student();
            student.buildStudent();

            enteredStudents.add(student);
            System.out.println("Would you like to enter a student?");
            nextInput = input.nextLine().toLowerCase();
        };

        Teacher teacher = new Teacher();
        teacher.setFirstName("Bill");
        teacher.setLastName("Nye");
        teacher.setSubject("Science");
        teacher.setYearsTeaching(35);

        Course course = new Course();
        course.buildCourseRoster(enteredStudents);
        course.buildCourseAttendance();
        course.addSubject(teacher);
        course.addTeacher(teacher);


        System.out.println(course.getCourseTeacher());
        System.out.println(course.getCourseSubject());



//        student.setName("Nat Hilterbrand");
//        student.setStudentId(3110121);
//        student.setNumberOfCredits(1);
//        student.setGpa(4.0);
    }
}
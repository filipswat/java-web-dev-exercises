package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class SchoolPractice {
    public static void main(String[] args) {
        Student myStudent = new Student("Filip", 1, 4.0);
        System.out.println(myStudent);
        myStudent.addGrade(0.0,1);
        System.out.println(myStudent);
        myStudent.addGrade(3.5, 600);
        System.out.println(myStudent);

        HashMap<Student, Double> studentList = new HashMap<>();
        studentList.put(myStudent, 3.0);
        Student anotherStudent = new Student("John", 3, 2.0);
        studentList.put(anotherStudent, 3.5);
        Teacher doctor = new Teacher("Dr.", "Doctor", "Science", 45);
        Course science101 = new Course("Science 101", doctor,
                3, studentList);

        System.out.println(science101);
    }
}

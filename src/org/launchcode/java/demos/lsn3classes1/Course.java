package org.launchcode.java.demos.lsn3classes1;
import java.util.HashMap;

public class Course {

    private String courseName;
    private Teacher teacher;
    private int numberOfCredits;
    private HashMap<Student, Double> students;

    public Course(String courseName, Teacher teacher, int numberOfCredits,
                  HashMap<Student, Double> students) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.numberOfCredits = numberOfCredits;
        this.students = students;
    }

    public Course(String courseName, Teacher teacher, int numberOfCredits) {
        this(courseName, teacher, numberOfCredits, new HashMap<Student, Double>());
    }

    @Override
    public String toString(){
        return courseName + " (Teacher: " + teacher.getLastName() + " | Credits: " + numberOfCredits +
                " | Students: " + students.keySet().size() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return courseName.equals(course.courseName);
    }

    @Override
    public int hashCode() {
        return courseName.hashCode();
    }
}

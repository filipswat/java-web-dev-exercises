package org.launchcode.java.demos.lsn3classes1;

public class Student {

    // set to automatically generate student IDs
    private static String currentStudentId = "000001";
    private String name;
    private final String studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int numberOfCredits, double gpa) {
        this.name = name;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;

        // sets student ID for current student, increments and left pads ID number
        this.studentId = currentStudentId;
        currentStudentId = Integer.toString(Integer.parseInt(currentStudentId) + 1);
        while (currentStudentId.length() < 6) {
            currentStudentId = "0" + currentStudentId;
        }
    }

    public Student(String name) {
        this(name, 0, 0.0);
    }

    public void setName(String aName) {
        name = aName;
    }

    public String getName() {
        return name;
    }

    public String getStudentId(){
        return studentId;
    }

    public void setNumberOfCredits(int aCreditNumber) {
        numberOfCredits = aCreditNumber;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public double getGpa(){
        return gpa;
    }

    public String getGradeLevel() {
        if (getNumberOfCredits() < 30){
            return "Freshman";
        } else if (getNumberOfCredits() < 60) {
            return "Sophomore";
        } else if (getNumberOfCredits() < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public void addGrade(double grade, int gradeCredits) {
        if ((grade < 0.0) || (grade > 4.0)) {
            System.out.println("Invalid grade not added (Valid Range: 0.0 - 4.0");
        }

        double currentQualityScore = gpa * numberOfCredits;
        double newQualityScore = currentQualityScore + (grade * gradeCredits);
        setNumberOfCredits(numberOfCredits + gradeCredits);
        setGpa(newQualityScore / numberOfCredits);
    }

    @Override
    public String toString(){
        return name + " (ID:" + studentId + " | Level: " + getGradeLevel()
                + " | GPA: " + (Math.round(gpa * 100.0) / 100.0) + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return studentId.equals(student.studentId);
    }

    @Override
    public int hashCode() {
        return studentId.hashCode();
    }
}
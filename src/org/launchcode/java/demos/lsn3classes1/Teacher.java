package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public void setFirstName(String afirstName){
        firstName = afirstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String aLastName) {
        lastName = aLastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setSubject(String aSubject){
        subject = aSubject;
    }

    public String getSubject(){
        return subject;
    }

    public void setYearsTeaching(int someYears){
        yearsTeaching = someYears;
    }

    public int getYearsTeaching(){
        return yearsTeaching;
    }
}
package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    public String firstName;
    public String lastName;
    public String subject;
    private Double yearsTeaching;

    public void setFirstName(String aFirstName){
        firstName = aFirstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String aLastName){
        lastName = aLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSubject(String aSubject){
        subject = aSubject;
    }

    public String getSubject() {
        return subject;
    }

    public void setYearsTeaching(double aYearsTeaching) {
        yearsTeaching = aYearsTeaching;
    }

    public double getYearsTeaching() {
        return yearsTeaching;
    }
}

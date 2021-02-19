package org.test;

public class Student extends User {

    private String className;

    public Student(String firstName, String lastName, Gender gender, String className) {
        super(firstName, lastName, gender);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ID=" +this.getId()+ "\nFirstName="+this.getFirstName()+",\n"+"LastName="+this.getLastName()+"\n"+"Gender="+this.getGender()+"\nClass Name="+className;
    }
}

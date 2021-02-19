package org.test;

public class Admin extends User{

    private Department department;
    public Double salary;

    public Admin(String firstName, String lastName, Gender gender, Department department, Double salary) {
        super(firstName, lastName, gender);
        this.department = department;
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    enum Department {
        HR, SPORTS, TEACHING
    }
}

package org.test;

import java.util.Arrays;

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
    @Override
    public String toString() {
        return "FirstName=" +this.getFirstName()+
                "\nLastName="+this.getLastName()+
                ",\n"+"Gender="+this.getGender()+
                "\n"+"Department="+this.getDepartment()+
                "\nSalary="+getSalary();
    }

    enum Department {
        HR("H"), Sports("S"),Teaching("T");
        Department(String value) {
            this.value = value;
        }
        private final String value;

        public String getValue() {
            return value;
        }
        public static Department findByValue(String value) {
            return Arrays
                    .stream(values())
                    .filter(gender1 -> gender1.value.equalsIgnoreCase(value))
                    .findFirst()
                    .orElse(null);
        }
    }
}

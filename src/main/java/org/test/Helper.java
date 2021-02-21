package org.test;

import java.util.List;
import java.util.Scanner;

public class Helper {

    public static void main(String[] args) {
        List<Admin> admins;
        SISOperation sisOperation = new SISOperationImpl();
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;

        while (isRun) {
            System.out.println("1. Add New Student");
            System.out.println("2. Add as Admin");
            System.out.println("3. List All Students");
            System.out.println("4.List All Admins");
            System.out.println("5. Get Student Details");
            System.out.println("6. Update Student Details");
            System.out.println("0. Exit");
            int op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1:
                    String firstName, lastName, gender, classNo;

                    System.out.println("Entre First Name");
                    firstName = scanner.nextLine();
                    System.out.println("Entre Last Name");
                    lastName = scanner.nextLine();
                    System.out.println("Entre Gender");
                    gender = scanner.nextLine();
                    System.out.println("Entre Class No");
                    classNo = scanner.nextLine();
                    Student student = new Student(firstName, lastName, User.Gender.findByValue(gender), classNo);
                    sisOperation.addStudent(student);
                    break;
                case 2:
                    String firstNameOfAdmin, lastNameOfAdmin, genderOfAdmin,DepartmentOfAdmin;
                    Double SalaryOfAdmin;


                    System.out.println("Entre First Name");
                    firstNameOfAdmin = scanner.nextLine();
                    System.out.println("Entre Last Name");
                    lastNameOfAdmin = scanner.nextLine();
                    System.out.println("Entre Gender");
                    genderOfAdmin = scanner.nextLine();
                    System.out.println("Enter the Department");
                    DepartmentOfAdmin = scanner.nextLine();
                    System.out.println("Enter the Salary");
                    SalaryOfAdmin = scanner.nextDouble();
                    Admin admin = new Admin(firstNameOfAdmin,lastNameOfAdmin,User.Gender.findByValue(genderOfAdmin),Admin.Department.findByValue(DepartmentOfAdmin),SalaryOfAdmin);
                    sisOperation.addAdmin(admin);
                    break;
                case 3:
                    sisOperation.printStudentList(sisOperation.findAllStudent());
                    break;
                case 4:
                    sisOperation.printAdminList(sisOperation.SortAllAdmin());
                    break;
                case 5:
                    System.out.println("Enter SID");
                    String sid = scanner.nextLine();
                    sisOperation.printStudent(sisOperation.findById(sid));
                    break;
                case 6:
                    String id;
                    System.out.println("Entre Student ID");
                    id = scanner.nextLine();
                    System.out.println("Entre First Name");
                    firstName = scanner.nextLine();
                    System.out.println("Entre Last Name");
                    lastName = scanner.nextLine();
                    System.out.println("Entre Gender");
                    gender = scanner.nextLine();
                    System.out.println("Entre Class No");
                    classNo = scanner.nextLine();
                    student = new Student(firstName, lastName, User.Gender.findByValue(gender), classNo);
                    sisOperation.updateStudent(id, student);
                    break;
                case 0:
                    System.out.println("Thanks for using SIS");
                    isRun = false;
                    break;
                default:
                    System.out.println("Invalid id");
            }
            System.out.println("---------------");
        }
    }
}

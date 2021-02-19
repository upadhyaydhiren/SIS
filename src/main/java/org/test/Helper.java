package org.test;

import java.util.Scanner;

public class Helper {

    public static void main(String[] args) {
        SISOperation sisOperation = new SISOperationImpl();

        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;

        while (isRun) {
            System.out.println("1. Add New Student");
            System.out.println("2. List All Students");
            System.out.println("3. Get Student Details");
            System.out.println("4. Update Student Details");
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
                    Student student = new Student(firstName, lastName, User.Gender.valueOf(gender), classNo);
                    sisOperation.addStudent(student);
                    break;
                case 2:
                    sisOperation.printStudentList(sisOperation.findAllStudent());
                    break;
                case 3:
                    System.out.println("Enter SID");
                    String sid = scanner.nextLine();
                    sisOperation.printStudent(sisOperation.findById(sid));
                    break;
                case 4:
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
                    student = new Student(firstName, lastName, User.Gender.valueOf(gender), classNo);
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

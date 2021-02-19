package org.test;

import java.util.List;
import java.util.Objects;

public interface SISOperation {

    void addStudent(Student student);
    List<Student> findAllStudent();
    void updateStudent(String studentId, Student student);
    Student findById(String id);

    default void printStudent(Student student) {
        System.out.println(student);
    }

    default void printStudentList(List<Student> students) {

        if (Objects.nonNull(students) && students.isEmpty()) {
            return;
        }

        students.forEach(this::printStudent);
    }
}

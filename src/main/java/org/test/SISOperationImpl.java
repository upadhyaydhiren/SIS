package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SISOperationImpl implements SISOperation {

    private final List<Student> students;

    public SISOperationImpl() {
        this.students = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {

        if (Objects.isNull(student)) {
            throw new RuntimeException("Invalid id/data");
        }

        students.add(student);
    }

    @Override
    public List<Student> findAllStudent() {
        return students;
    }

    @Override
    public void updateStudent(String studentId, Student student) {
        Student matchedStudent = findById(studentId);

        if (Objects.isNull(matchedStudent) || Objects.isNull(student)) {
            throw new RuntimeException("Invalid id/data");
        }

        if (Objects.nonNull(student.getFirstName())) {
            matchedStudent.setFirstName(student.getFirstName());
        }

        if (Objects.nonNull(student.getLastName())) {
            matchedStudent.setLastName(student.getLastName());
        }

        if (Objects.nonNull(student.getClassName())) {
            matchedStudent.setClassName(student.getClassName());
        }

        if (Objects.nonNull(student.getGender())) {
            matchedStudent.setGender(student.getGender());
        }
    }

    @Override
    public Student findById(String id) {
        return students
                .stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

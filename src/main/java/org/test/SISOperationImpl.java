package org.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SISOperationImpl implements SISOperation {

    private final List<Student> students;
    private final List<Admin> admins;
   // private Object Admin;

    public SISOperationImpl() {
        this.students = new ArrayList<>();
        this.admins =new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {

        if (Objects.isNull(student)) {
            throw new RuntimeException("Invalid id/data");
        }

        students.add(student);
    }
    @Override
    public void addAdmin(Admin admin)
    {
        admins.add(admin);
    }

    @Override
    public List<Student> findAllStudent() {
        students.sort(Comparator.comparing(User::getFirstName).thenComparing(User::getLastName));
        return students;
    }
  @Override
  public List<Admin>SortAllAdmin()
  {
     admins.sort(Comparator.comparing(User::getFirstName).thenComparing(User::getLastName));
     return admins;
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

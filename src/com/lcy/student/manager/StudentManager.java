package com.lcy.student.manager;

import com.lcy.student.model.Student;

import java.util.List;

public interface StudentManager {
    boolean addStudent(Student st);
    boolean deleteStudent(String id);
    boolean deleteStudent(Student st);
    boolean updateStudent(Student st);

    List<Student> selectAllStudent();

    void load();

    String getSizeOfClass();

    void save();

    Student findByID(String id);

    boolean updateStudent(String id, String name, int age);
}

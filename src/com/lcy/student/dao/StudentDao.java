package com.lcy.student.dao;

import com.lcy.student.model.Student;

import java.util.List;

public interface StudentDao {
    //对学生信息表的操作
    boolean add(Student st);
    boolean update(Student st);
    boolean delete(Student st);
    boolean delete(String id);
    Student find(String id);
    List<Student> findByName(String name);

}

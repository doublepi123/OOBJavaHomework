package com.lcy.student.managerimpl;

import com.lcy.student.dao.StudentDao;
import com.lcy.student.daoimpl.StudentDaoimpl;
import com.lcy.student.manager.StudentManager;
import com.lcy.student.model.Student;

import java.util.List;

public class StudentManagerImpl implements StudentManager {
    StudentDao studentDao = new StudentDaoimpl();
    @Override
    public boolean addStudent(Student st) {
        return studentDao.add(st);
    }

    @Override
    public boolean deleteStudent(String id) {
        return studentDao.delete(id);
    }

    @Override
    public boolean deleteStudent(Student st) {
        return studentDao.delete(st);
    }

    @Override
    public boolean updateStudent(Student st) {
        return updateStudent(st);
    }

    @Override
    public List<Student> selectAllStudent() {
        return null;
    }

    @Override
    public void load() {

    }

    @Override
    public String getSizeOfClass() {
        return null;
    }

    @Override
    public void save() {

    }

    @Override
    public Student findByID(String id) {
        return null;
    }

    @Override
    public boolean updateStudent(String id, String name, int age) {
        return false;
    }
}

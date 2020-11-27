package com.lcy.student.tester;

import com.lcy.student.manager.StudentManager;
import com.lcy.student.managerimpl.StudentManagerImpl;
import com.lcy.student.model.Student;

import java.util.List;

public class StudentManagerTester {
    public static void main(String[] args) {
        Student st1 = new Student("2001001","刘备",25);
        Student st2 = new Student("2001002","关羽",26);
        Student st3 = new Student("2001003","张飞",27);
        Student st4 = new Student("2001004","张飞",33);
        StudentManager taoyuan = new StudentManagerImpl() {
            @Override
            public boolean addStudent(Student st) {
                return false;
            }

            @Override
            public boolean deleteStudent(String id) {
                return false;
            }

            @Override
            public boolean deleteStudent(Student st) {
                return false;
            }

            @Override
            public boolean updateStudent(Student st) {
                return false;
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
        };
        taoyuan.addStudent(st1);
        taoyuan.addStudent(st2);
        taoyuan.addStudent(st3);
        taoyuan.addStudent(st4);
        System.out.println(taoyuan);
        System.out.println("查找张飞：");
//        System.out.println(taoyuan.printInfomation(taoyuan.findByName("张飞")));
//        taoyuan.updateStudent("2001001","刘了个备胎",666);
//        System.out.println("查找刘");
//        System.out.println(taoyuan.printInfomation((taoyuan.fuzzyFindByName("刘"))));
    }
}

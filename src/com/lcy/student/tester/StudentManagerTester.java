package com.lcy.student.tester;

import com.lcy.student.manager.StudentManager;
import com.lcy.student.model.Student;

public class StudentManagerTester {
    public static void main(String[] args) {
        Student st1 = new Student("2001001","刘备",25);
        Student st2 = new Student("2001002","关羽",26);
        Student st3 = new Student("2001003","张飞",27);
        Student st4 = new Student("2001004","张飞",33);
        StudentManager taoyuan = new StudentManager("桃源班");
        taoyuan.addStudent(st1);
        taoyuan.addStudent(st2);
        taoyuan.addStudent(st3);
        taoyuan.addStudent(st4);
        System.out.println(taoyuan);
        System.out.println("查找张飞：");
        System.out.println(taoyuan.printInfomation(taoyuan.findByName("张飞")));
        taoyuan.updateStudent("2001001","刘了个备胎",666);
        System.out.println("查找刘");
        System.out.println(taoyuan.printInfomation((taoyuan.fuzzyFindByName("刘"))));
    }
}

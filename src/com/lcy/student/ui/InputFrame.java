package com.lcy.student.ui;

import com.lcy.student.manager.StudentManager;
import com.lcy.student.model.Student;
import com.lcy.student.util.KeyInput;

public class InputFrame {
    private String id, name;
    private int age;
    private StudentManager aClass;

    public InputFrame(StudentManager aClass) {
        this.aClass = aClass;
    }

    public void inputOneStudent(){
        while(true) {
            System.out.println("请输入第" + (aClass.getSizeOfClass() + 1) + "个学生信息(输入no结束)：");
            System.out.print("学号：");

            id = KeyInput.getString();
            if(id.contains("no")) return;
            System.out.print("姓名：");
            name = KeyInput.getString();

            System.out.print("年龄：");
            age = KeyInput.getInt();

            if(aClass.addStudent(new Student(id, name, age)) == false){
                System.out.println("添加失败，该学号已经存在！！！");
            };
        }
    }
}

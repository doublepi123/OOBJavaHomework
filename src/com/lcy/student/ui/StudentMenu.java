package com.lcy.student.ui;

import com.lcy.student.manager.StudentManager;
import com.lcy.student.model.Student;
import com.lcy.student.util.KeyInput;

public class StudentMenu {
    private StudentManager aClass;
    private InputFrame input;
    public StudentMenu(StudentManager aClass){
        this.aClass = aClass;
        input = new InputFrame(aClass);
    }
    public void clear(){
        for(int i = 0 ; i < 100 ; i++){
            System.out.println();
        }
    }

    public void showMenu(){
        System.out.println("**********学生信息管理系统**********");
        System.out.println("1.录入学生信息");
        System.out.println("2.修改学生信息");
        System.out.println("3.查询学生信息");
        System.out.println("4.删除学生信息");
        System.out.println("0.退出系统");
        System.out.print("**********请输入您的选择：");
    }

    public void doMenu(){
        int choice;
        while(true){
            clear();
            showMenu();
            choice = KeyInput.getInt();
            switch (choice){
                case 0:
                    aClass.save();
                    System.exit(0);
                    break;
                case 1:
                    input.inputOneStudent();
                    break;
                case 3:
                    System.out.println(aClass);
                    System.out.println("按回车键继续");
                    KeyInput.getString();
            }
        }
    }
}

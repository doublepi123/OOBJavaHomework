package com.lcy.student.ui;

import com.lcy.student.manager.StudentManager;
import com.lcy.student.model.Student;
import com.lcy.student.util.KeyInput;

import java.io.IOException;

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
        System.out.println("**********学生信息管理系统**********\n(当前系统中已有"+aClass.getSizeOfClass()+"人）");
        System.out.println("1.录入学生信息");
        System.out.println("2.修改学生信息");
        System.out.println("3.查询学生信息");
        System.out.println("4.删除学生信息");
        System.out.println("0.退出系统");
        System.out.print("**********请输入您的选择：");
    }

    public void doMenu(){
        try{
            aClass.load();
        }catch (IOException e) {
            //e.printStackTrace();
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
        }
        int choice;
        while(true){
            clear();
            showMenu();
            choice = KeyInput.getInt();
            String id;
            switch (choice){
                case 0:
                    try {
                        aClass.save();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.exit(0);
                    break;
                case 1:
                    input.inputOneStudent();
                    break;
                case 2:
                    System.out.println(aClass);
                    System.out.print("请输入要修改学生的学号：");
                    id = KeyInput.getString();
                    if(aClass.findByID(id) == null){
                        System.out.println("学号不存在");
                        break;
                    }
                    System.out.println(aClass.findByID(id));
                    System.out.print("请输入姓名:");
                    String name = KeyInput.getString();
                    System.out.print("请输入年龄:");
                    int age = KeyInput.getInt();
                    if(aClass.updateStudent(id,name,age)){
                        System.out.println("修改成功");
                    }else{
                        System.out.println("修改失败！！！");
                    }
                    break;
                case 3:
                    System.out.println(aClass);
                    break;
                case 4:
                    System.out.println(aClass);
                    System.out.print("请输入要删除学生的学号：");
                    id = KeyInput.getString();
                    if(aClass.deleteStudent(id)){
                        System.out.println("删除成功");
                    }else{
                        System.out.println("学号有误，删除失败！！！");

                    }
                    break;
                default:
                    System.out.println("您输入的选项不存在！！！");
            }
            System.out.println("按回车键继续");
            KeyInput.getString();
        }
    }
}

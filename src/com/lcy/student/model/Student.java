package com.lcy.student.model;

import java.io.Serializable;

public class Student implements Serializable{
    private String name,id;
    private int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "学号："+id+"\t"+"姓名：" + name + "\t" +
                "年龄：" + age;
    }
}

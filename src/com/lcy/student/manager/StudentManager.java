package com.lcy.student.manager;

import com.lcy.student.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class StudentManager {
    private String className;
    private HashMap<String , Student> students;

    @Override
    public String toString() {
        String str = "班级:"+className +"\t班级人数:"+students.size()+"\n";
        for (Student it : students.values()){
            str += it.getId() + "\t" + it.getName() +"\t" + it.getAge()+"\n";
        }
        return str;
    }

    public int getSizeOfClass(){
        return students.size();
    }
    //add a student
    public boolean addStudent(Student st){
        //Check if the student exist
        if(students.containsValue(st)) return false;
        else {
            students.put(st.getId(),st);
            return true;
        }
    }
    //find
    public Student findByID(String id){
        return students.get(id);
    }

    public ArrayList<String> findByName(String name){
        ArrayList<String> s = new ArrayList<String>();
        for (Student i : students.values()){
            if (i.getName() == name) {
                s.add(i.getId());
            }
        }
        return s;
    }

    public ArrayList<String> fuzzyFindByName(String name){
        ArrayList<String> s = new ArrayList<String>();
        for (Student i : students.values()){
            if (i.getName().contains(name)) {
                s.add(i.getId());
            }
        }
        return s;
    }

    public String printInfomation(ArrayList<String> lt){
        String str = new String();
        for (String st: lt){
            str += students.get(st).getId() +"\t" +students.get(st).getName() +"\t"+students.get(st).getAge() +"\n";
        }
        return str;
    }
    //delete a student
    public boolean deleteStudent(String id){
        //delete by id
        if(students.containsKey(id)){
            students.remove(id);
            return true;
        }
        return false;
    }
    public boolean deleteStudent(Student st){
        //delete by object
        if (students.containsValue(st)){
            students.remove(st);
            return true;
        }
        return false;
    }
    //update a student
    public boolean updateStudent(String id, String name , int age){
        if (students.get(id) == null) return false;
        students.get(id).setName(name);
        students.get(id).setAge(age);
        return true;
    }

    //save
//    public boolean saveToFile(String fileName){
//        java.io.DataOutput()
//    }
    public void save() throws IOException {
        FileOutputStream fos = new FileOutputStream("Stu.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(className);
        for(Student it : students.values()){
            oos.writeObject(it);
        }
    }
    public void load() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Stu.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        className = (String) ois.readObject();
        while (true) {
            Student it = (Student) ois.readObject();
            if (it == null) return;
            students.put(it.getId(), it);
        }
    }
    public StudentManager(String className) {
        this.className = className;
        students = new HashMap<String , Student>();
    }
}

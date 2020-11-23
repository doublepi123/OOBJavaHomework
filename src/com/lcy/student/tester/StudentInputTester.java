package com.lcy.student.tester;

import com.lcy.student.manager.StudentManager;
import com.lcy.student.ui.InputFrame;

public class StudentInputTester {
    public static void main(String[] args) {
        StudentManager taoyuan = new StudentManager("桃源班");
        InputFrame input = new InputFrame(taoyuan);
        input.inputOneStudent();
        System.out.println(taoyuan);
    }
}

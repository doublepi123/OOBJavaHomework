package com.lcy.student.tester;

import com.lcy.student.manager.StudentManager;
import com.lcy.student.model.Student;
import com.lcy.student.ui.StudentMenu;

import java.io.IOException;

public class StudentMenuTester {
    public static void main(String[] args) {
        StudentManager xinke181 = new StudentManager("信科181");
        StudentMenu studentMenu = new StudentMenu(xinke181);
        studentMenu.doMenu();
    }
}

package com.lcy.student.tester;

import com.lcy.student.manager.StudentManager;
import com.lcy.student.ui.StudentMenu;

public class StudentMenuTester {
    public static void main(String[] args) {
        StudentManager taoyuan = new StudentManager("桃源班");
        StudentMenu studentMenu = new StudentMenu(taoyuan);
        studentMenu.doMenu();
    }
}

package com.Encounter.demo.SMS;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/16 16:16
 */

/**
 * 完成一个学生管理系统，
 * 系统的功能如下:
 * 注意:学生类中有(ID、name、age)三个属性。
 * ====欢迎进入学生管理系统=====
 * 1、添加学生(add)
 * 2、查看学生
 * (query)
 * 3、退出系统(exit)
 * 需要用户输入add、query或者exit，选择进入不同的功能,
 */
public class Test
    {
        public static void main(String[] args)
            {
                ArrayList<Student> student = new ArrayList<>();
                StudentManager sm = new StudentManager(student);
                sm.startMenu();
            }
    }

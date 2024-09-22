package com.Encounter.demo.SMS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/16 16:01
 */
public class StudentManager
    {
        ArrayList<Student> students;

        public StudentManager(ArrayList<Student> students)
            {
                this.students = students;
            }

        //添加学生
        public void add()
            {
                Student s = new Student();
                Scanner sc = new Scanner(System.in);
                System.out.print("请输入要添加的学生学号：");
                s.setID(sc.nextInt());
                System.out.print("请输入要添加的学生姓名：");
                s.setName(sc.next());
                System.out.print("请输入要添加的学生年龄：");
                s.setAge(sc.nextInt());
                students.add(s);
                System.out.println("添加成功！");
            }

        //查看学生
        public void query()
            {
                for (int i = 0; i < students.size(); i++)
                    {
                        Student student = students.get(i);
                        System.out.println("===学生信息如下：===");
                        System.out.println("学生学号：" + student.getID());
                        System.out.println("学生姓名：" + student.getName());
                        System.out.println("学生年龄：" + student.getAge());
                    }
            }

        //开始菜单
        public void startMenu()
            {
                Scanner sc = new Scanner(System.in);
                while (true)
                    {
                        System.out.println("=====欢迎进入学生管理系统=====");
                        System.out.println("1.添加学生(add)");
                        System.out.println("2.查看学生(query)");
                        System.out.println("3.退出系统(exit)");
                        System.out.print("请选择操作命令：");
                        String choice = sc.next();
                        switch (choice)
                            {
                                case "add" -> add();
                                case "query" -> query();
                                case "exit" ->
                                    {
                                        return;
                                    }
                                default -> System.out.println("您输入的选项有误，请重新输入！！！");
                            }
                    }
            }
    }

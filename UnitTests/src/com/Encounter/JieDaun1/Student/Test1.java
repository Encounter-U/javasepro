package com.Encounter.JieDaun1.Student;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/16 21:18
 */
public class Test1
    {
        public static void main(String[] args)
            {
                ArrayList<Student> student=new ArrayList<>();
                student.add(new Student("小明",15,'男',90));
                student.add(new Student("小张",16,'男',92));
                student.add(new Student("小红",15,'女',95));
                print(student);
            }
        public static void print(ArrayList<Student> students)
            {
                for (int i = 0; i < students.size(); i++)
                    {
                        Student student = students.get(i);
                        System.out.println("姓名："+student.getName());
                        System.out.println("年龄："+student.getAge());
                        System.out.println("性别："+student.getGender());
                        System.out.println("成绩："+student.getScore());
                    }
            }
    }

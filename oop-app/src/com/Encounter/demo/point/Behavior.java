package com.Encounter.demo.point;

import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/15 21:06
 */
public class Behavior
    {
        Student[] student;

        public Behavior(Student[] student)
            {
                this.student = student;
            }

        //开始点名
        public void point()
            {
                Random r = new Random();
                int id = r.nextInt(student.length);
                System.out.println(student[id].getName() + "==" + student[id].getAge());
            }
    }

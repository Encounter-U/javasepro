package com.Encounter.javabean;

/**
 * @author Encounter
 * @date 2024/6/15 19:01
 */
public class StudentOperator
    {
        private Student student;

        public StudentOperator(Student student)
            {
                this.student = student;
            }

        public void printPass()
            {
                System.out.println(student.getScore() >= 60 ? student.getName() + "及格" : student.getName() + "不及格");
            }
    }

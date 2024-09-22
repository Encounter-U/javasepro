package com.Encounter.demo.teacher;

/**
 * @author Encounter
 * @date 2024/6/15 20:55
 */
public class Behavior
    {
        Teacher teacher;

        public Behavior(Teacher teacher)
            {
                this.teacher = teacher;
            }

        public void show()
            {
                System.out.println("姓名："+teacher.getName() + "、年龄：" + teacher.getAge());

            }
    }

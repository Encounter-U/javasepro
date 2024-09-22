package com.Encounter.demo.point;

/**
 * @author Encounter
 * @date 2024/6/15 21:09
 */

/**
 * 老师要制作一个点名系统，录入班级里面有5名同学的信息，包括姓名(name)和年龄(age)。5个学生分别是:小明、13岁，小张、12岁，小
 * 红、13岁，小军、13岁，小白、12岁，每次都随机从这5个同学随机抽取一位并将他们的姓名和年龄输出到控制台上。
 * 输出格式如下:
 * 小红==13岁
 */
public class Test
    {
        public static void main(String[] args)
            {
                Student[] s = new Student[5];
                s[0] = new Student("小明", 13);
                s[1] = new Student("小张", 12);
                s[2] = new Student("小红", 13);
                s[3] = new Student("小军", 13);
                s[4] = new Student("小白", 12);
                Behavior b = new Behavior(s);
                b.point();
            }
    }

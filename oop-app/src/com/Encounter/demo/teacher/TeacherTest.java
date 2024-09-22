package com.Encounter.demo.teacher;

/**
 * @author Encounter
 * @date 2024/6/15 16:08
 */

/**
 * 定义一个老师(eacher)类，这个老师类有姓名和年龄两个属性，有一个方法能展示姓名(name)和年龄(age)。创一个测试类，并完成如下内容:
 * 创建两个老师对象通过成员方法将他们的信息打印到控制台上。(格式如下)
 * 王老师的年龄是32
 * 李老师的年龄是33
 */
public class TeacherTest
    {
        public static void main(String[] args)
            {
                Behavior b1 = new Behavior(new Teacher("王老师", 32));
                Behavior b2 = new Behavior(new Teacher("李老师", 33));
                b1.show();
                b2.show();
            }
    }

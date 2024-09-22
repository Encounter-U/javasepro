package com.Encounter.demo.student;

/**
 * @author Encounter
 * @date 2024/6/15 16:20
 */

/**
 * 定义一个学生类(Student)，学生类的成员属性分别是姓名(name)
 * 语文成绩(yuwen)
 * 数学成绩(shuxue)
 * 爱好(likes字符串数组类
 * 型)，创一个测试类，并完成如下内容:
 * 创建两个学生对象通过成员方法将学生信息打印到控制台上。(格式如下)
 * 张三，语文成绩:90，数学成绩:98
 * 唱
 * 划
 * rap
 * 篮球
 * 李四，请
 * 语文成绩:93，数学成绩:90
 * 抽烟
 * 喝酒
 * 烫头
 */
public class Test
    {
        public static void main(String[] args)
            {
                Student s1=new Student();
                s1.name="张三";
                s1.yuwen=90;
                s1.shuxue=98;
                s1.likes[0]="唱";
                s1.likes[1]="跳";
                s1.likes[2]="rap";
                s1.likes[3]="篮球";
                s1.printInfo();

                Student s2=new Student();
                s2.name="李四";
                s2.yuwen=93;
                s2.shuxue=90;
                s2.likes[0]="抽烟";
                s2.likes[1]="喝酒";
                s2.likes[2]="烫头";
                s2.printInfo();

            }
    }

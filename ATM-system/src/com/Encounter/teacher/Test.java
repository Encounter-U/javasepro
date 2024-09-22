package com.Encounter.teacher;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/17 0:30
 */

/**
 * ---欢迎来到<老师>管理系统------
 * 请输入您的选择:1.添加老师 2.删除老师 3.修改老师 4.查看老师
 * 5.退出
 * 请输入老师id:
 * heima0001
 * 请输入老师姓名:
 * 张三
 * 请输入老师年龄:
 * 23
 * 请输入老师生日:
 * 1999-11-11
 * 添加成功
 */
public class Test
    {
        public static void main(String[] args)
            {
                ArrayList<Teacher> teachers=new ArrayList<>();
                TeacherManager tm=new TeacherManager(teachers);
                tm.start();
            }
    }

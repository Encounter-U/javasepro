package com.Encounter.teacher;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Encounter
 * @date 2024/6/16 23:39
 */
public class TeacherManager
    {
        private ArrayList<Teacher> teachers = new ArrayList<>();
        private Teacher teacher = new Teacher();
        private Scanner sc = new Scanner(System.in);

        public TeacherManager(ArrayList<Teacher> teachers)
            {
                this.teachers = teachers;
            }

        public void start()
            {
                while (true)
                    {
                        System.out.println("--------欢迎来到<老师>管理系统--------");
                        System.out.println("1.添加老师");
                        System.out.println("2.删除老师");
                        System.out.println("3.修改老师");
                        System.out.println("4.查看老师");
                        System.out.println("5.退出");
                        System.out.print("请输入您的选择：");
                        String choice = sc.next();
                        switch (choice)
                            {
                                //添加老师
                                case "1" -> add();
                                //删除老师
                                case "2" -> delete();
                                //修改老师
                                case "3" -> revise();
                                //查看老师
                                case "4" -> show();
                                //退出系统
                                case "5" ->
                                    {
                                        System.out.println("系统正在退出中...");
                                        return;
                                    }
                                default -> System.out.println("您输入的选项有误，请重新输入！");
                            }
                    }
            }


        //添加老师
        private void add()
            {
                while (true)
                    {
                        System.out.println("请输入老师id（不可修改，不可重复）：");
                        String id = sc.next();
                        ArrayList<Teacher> t = exist(teachers, id);
                        if (t != null)
                            System.out.println("该id已存在，请使用其他id");
                        else
                            {
                                Teacher teacher1=new Teacher();
                                teacher1.setId(id);
                                System.out.println("请输入老师姓名：");
                                teacher1.setName(sc.next());
                                System.out.println("请输入老师年龄：");
                                teacher1.setAge(sc.nextInt());
                                System.out.println("请输入老师生日：");
                                teacher1.setBirthday(sc.next());
                                teachers.add(teacher1);
                                System.out.println(teacher1.getName() + "老师已添加成功");
                                return;
                            }
                    }
            }

        //判断id是否重复
        private ArrayList<Teacher> exist(ArrayList<Teacher> teachers, String id)
            {
                for (int i = 0; i < teachers.size(); i++)
                    {
                        if (id.equals(teachers.get(i).getId()))
                            return teachers;
                    }
                return null;
            }

        //删除老师
        private void delete()
            {

                if (teachers.isEmpty())
                    {
                        System.out.println("暂时还没有老师信息，请先去添加老师信息吧！");
                        return;
                    }
                while (true)
                    {
                        System.out.println("====================");
                        System.out.println("请输入要删除的老师id：");
                        String id = sc.next();
                        ArrayList<Teacher> t = exist(teachers, id);
                        if (t != null)
                            {
                                for (int i = 0; i < teachers.size(); i++)
                                    {
                                        Teacher teacher1 = teachers.get(i);
                                        if (teacher1.getId().equals(id))
                                            {
                                                teachers.remove(i);
                                                System.out.println("删除成功！");
                                                return;
                                            }
                                    }
                            }
                        else
                            System.out.println("没有该老师id,请重新输入！");
                    }
            }

        //修改老师
        private void revise()
            {

                if (teachers.isEmpty())
                    {
                        System.out.println("暂时还没有老师信息，请先去添加老师信息吧！");
                        return;
                    }
                System.out.println("====================");
                System.out.println("请输入要修改的老师id：");
                String id = sc.next();
                ArrayList<Teacher> t1 = exist(teachers, id);
                while (true)
                    {
                        if (t1 != null)
                            {
                                System.out.println("========修改界面========");
                                System.out.println("1.全部修改");
                                System.out.println("2.修改姓名");
                                System.out.println("3.修改年龄");
                                System.out.println("4.修改生日");
                                System.out.println("5.退出修改");
                                System.out.print("请输入您的选择：");
                                String choice = sc.next();
                                switch (choice)
                                    {
                                        case "1" ->
                                            {
                                                System.out.println("请输入修改后的姓名：");
                                                teacher.setName(sc.next());
                                                System.out.println("请输入修改后的年龄：");
                                                teacher.setAge(sc.nextInt());
                                                System.out.println("请输入修改后的生日：");
                                                teacher.setBirthday(sc.next());
                                                System.out.println("修改成功！");
                                            }
                                        case "2" ->
                                            {
                                                System.out.println("请输入修改后的姓名：");
                                                teacher.setName(sc.next());
                                                System.out.println("修改成功！");
                                            }
                                        case "3" ->
                                            {
                                                System.out.println("请输入修改后的年龄：");
                                                teacher.setAge(sc.nextInt());
                                                System.out.println("修改成功！");
                                            }
                                        case "4" ->
                                            {
                                                System.out.println("请输入修改后的生日：");
                                                teacher.setBirthday(sc.next());
                                                System.out.println("修改成功！");
                                            }
                                        case "5" ->
                                            {
                                                System.out.println("修改界面已退出。");
                                                return;
                                            }
                                        default -> System.out.println("您输入的选项有误，请重新输入！");
                                    }
                            }
                        else
                            System.out.println("您输入的id不存在，请重新输入！");
                    }
            }

        //查看老师
        private void show()
            {

                if (teachers.isEmpty())
                    {
                        System.out.println("暂时还没有老师信息，请先去添加老师信息吧！");
                        return;
                    }
                while (true)
                    {
                        System.out.println("========查询界面========");
                        System.out.println("1.查看全部老师");
                        System.out.println("2.根据id查询老师");
                        System.out.println("3.退出查询");
                        System.out.print("请输入您的选择：");
                        String choice = sc.next();
                        switch (choice)
                            {
                                //展示全部老师
                                case "1" -> showAll();
                                //根据id查询老师
                                case "2" -> showById();
                                //退出查询
                                case "3" ->
                                    {
                                        System.out.println("已退出查询界面。");
                                        return;
                                    }
                                default -> System.out.println("您输入的选项有误，请重新输入！");
                            }
                    }
            }

        //展示全部老师
        private void showAll()
            {
                System.out.println("===全体老师信息如下===");
                for (int i = 0; i < teachers.size(); i++)
                    {
                        Teacher t1 = teachers.get(i);
                        System.out.println("====================");
                        System.out.println("老师id：" + t1.getId());
                        System.out.println("老师姓名：" + t1.getName());
                        System.out.println("老师年龄：" + t1.getAge());
                        System.out.println("老师生日：" + t1.getBirthday());
                    }
            }

        //根据id查询老师
        private void showById()
            {
                while (true)
                    {
                        System.out.println("====================");
                        System.out.print("请输入要查询的老师id：");
                        String id = sc.next();
                        ArrayList<Teacher> t1 = exist(teachers, id);
                        if (t1 != null)
                            {
                                for (int i = 0; i < t1.size(); i++)
                                    {
                                        Teacher t = t1.get(i);
                                        if (id.equals(t.getId()))
                                            {
                                                System.out.println("====================");
                                                System.out.println("老师id：" + t.getId());
                                                System.out.println("老师姓名：" + t.getName());
                                                System.out.println("老师年龄：" + t.getAge());
                                                System.out.println("老师生日：" + t.getBirthday());
                                                return;
                                            }
                                    }
                            }
                        else
                            System.out.println("您要查询的id不存在，请重新输入！");
                    }
            }
    }

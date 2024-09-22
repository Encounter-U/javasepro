package com.Encounter.demo.arraydemo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/16 13:37
 */

/**
 * 完成菜品的上架、以及菜品信息浏览功能。
 */
public class Test1
    {
        public static void main(String[] args)
            {
                ArrayList<Food> foods = new ArrayList<>();
                foods.add(new Food("鱼香肉丝", 20, 15, "口感不错"));
                foods.add(new Food("尖椒炒肉", 18, 13, "价格合理"));
                foods.add(new Food("麻辣香锅", 25, 18, "辣味十足"));
                foods.add(new Food("宫保鸡丁", 30, 20, "十分正宗"));
                FoodOperator fo = new FoodOperator(foods);
                Scanner sc = new Scanner(System.in);
                boolean flag=true;
                while (flag)
                    {
                        System.out.println("---------------------------");
                        System.out.println("主菜单：");
                        System.out.println("1.查看所有菜品");
                        System.out.println("2.根据菜名查看详情");
                        System.out.println("3.添加菜品");
                        System.out.println("0.退出系统");
                        System.out.println("---------------------------");
                        System.out.print("请输入选项：");
                        int choice = sc.nextInt();
                        switch (choice)
                            {
                                case 1 -> fo.show();
                                case 2 ->
                                    {
                                        System.out.print("输入菜名：");
                                        String name = sc.next();
                                        fo.showInfoByName(name);
                                    }
                                case 3->fo.shelves();
                                case 0->flag=false;//退出循环
                                default -> System.out.println("您输入的选项有误，请重新输入！！！");
                            }
                    }
            }
    }

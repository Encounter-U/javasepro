package com.Encounter.demo.arraydemo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/16 13:39
 */
public class FoodOperator
    {
        private ArrayList<Food> food;

        public FoodOperator(ArrayList<Food> food)
            {
                this.food = food;
            }

        //菜品上架
        public void shelves()
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("---------------------------");
                System.out.print("请输入要添加的菜品名：");
                String name = sc.next();
                System.out.print("请输入要添加的菜品原价：");
                double price = sc.nextDouble();
                System.out.print("请输入要添加的菜品优惠价：");
                double specialPrice = sc.nextDouble();
                System.out.print("请输入要添加的菜品详情：");
                String Info = sc.next();
                food.add(new Food(name,price,specialPrice,Info));
                System.out.println("菜品添加成功！");
                System.out.println("---------------------------");
            }

        //菜品展示
        public void show()
            {
                System.out.println("---------菜品如下：---------");
                for (int i = 0; i < food.size(); i++)
                    {
                        Food f = food.get(i);
                        System.out.println("菜品名称：" + f.getName());
                        System.out.println("原价：" + f.getPrice());
                        System.out.println("特价：" + f.getSpecialPrice());
                        System.out.println("---------------------------");
                    }
            }

        //菜品详情
        public void showInfoByName(String str)
            {
                System.out.println("---------------------------");
                for (int i = 0; i < food.size(); i++)
                    {
                        Food f = food.get(i);
                        if (str.equals(f.getName()))
                            {
                                System.out.println("菜品详情如下：");
                                System.out.println("菜品名称：" + f.getName());
                                System.out.println("原价：" + f.getPrice());
                                System.out.println("特价：" + f.getSpecialPrice());
                                System.out.println("详情：" + f.getInfo());
                                return;
                            }
                    }
                System.out.println("暂无该菜品，请尝试搜索其他菜品！");
            }
    }

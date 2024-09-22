package com.Encounter.demo.fruit;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/15 16:33
 */

/**
 * 超市里面新进一批水果，请定义一个水果类Fruit，有成员属性分别是品种(brandName)，价格(price int类型)，创建一个测试类FruitTest
 * 类，并完成如下内容:
 * ① 创建两个水果对象通过成员方法将水果信息打印到控制台上。(格式如下)
 * 草莓==20元/斤
 * 香蕉==6元/斤
 * ② 在main方法中键盘录入一个1-1000钱数(整数、单位:元)，问最多能购买多少斤香并输出在控制台上，最多能购买多少斤草莓并输出在控制
 * 台上。(不足1斤，则舍掉)
 * 最终结果例如:
 * 120元能买6斤草莓
 * 120元能买20斤香蕉
 */
public class FruitTest
    {
        public static void main(String[] args)
            {
                //任务1
                Fruit strawberry=new Fruit();
                strawberry.brandName="草莓";
                strawberry.price=20;
                strawberry.printInfo();

                Fruit banana=new Fruit();
                banana.brandName="香蕉";
                banana.price=6;
                banana.printInfo();

                Scanner sc=new Scanner(System.in);
                String brandName;
                System.out.println("已上架的水果：草莓，香蕉");
                while (true)
                    {
                        System.out.print("请输入要购买的水果种类：");
                        brandName = sc.next();
                        if (brandName.equals("草莓")||brandName.equals("香蕉"))
                            break;
                        else
                            System.out.println("暂时还未上架该水果，请重新选择！");
                    }
                int money;
                while (true)
                    {
                        System.out.print("请输入您的money：");
                        money = sc.nextInt();
                        if (money>0&&money<=1000)
                            break;
                        else
                            System.out.println("您的money数不太对，请重新输入！");
                    }
                if (brandName.equals("草莓"))
                    strawberry.pay(money,brandName);
                else
                    banana.pay(money,brandName);
            }
    }

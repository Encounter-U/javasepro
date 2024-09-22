package com.Encounter.variable;

/**
 * @author Encounter
 * @date 2024/6/12 12:01
 */
public class VariableDemo1
    {
        public static void main(String[] args)
            {
                //认识变量，语法：数据类型 变量名 = 值;
                int age = 10;// = 赋值
                System.out.println(age);
                System.out.println("-------------------");

                //为什么要用变量？
                int a = 10;
                System.out.println(a);
                System.out.println(a);
                System.out.println(a);
                System.out.println(a);
                System.out.println(a);
                System.out.println("-------------------");

                //变量的特点
                int age2 = 18;
                age2 = 19;
                System.out.println(age2);
                age2 = age2 + 1;
                System.out.println(age2);
                System.out.println("-------------------");

                //现在有188.5元，花100，再收到20，剩多少
                double money = 188.5;
                //花100
                money = money - 100;
                //收到20
                money = money + 20;
                System.out.println(money);
                System.out.println("-------------------");
            }
    }

package com.Encounter.UnitTests;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/12 20:32
 */
public class Test9
    {
        public static void main(String[] args)
            {
                //任务1  任务2
                int a = 10;
                int b = 20;
                System.out.println("任务1、任务2:");
                System.out.println("两数之和为：" + (a + b));
                System.out.println("两数之差为：" + (a - b));
                System.out.println("两数之积为：" + (a * b));
                System.out.println("两数之商为：" + (a / b) + "\n");

                //任务3
                System.out.println("任务3:");
                System.out.println(++a);
                System.out.println(a++ + "\n");

                //任务4
                boolean b1 = (a + b) > 10;
                boolean b2 = (a * b) > 20;
                System.out.println("任务4:");
                System.out.println(b1 && b2 ? true : false);

                //任务5
                //int类型只能存储整数，所以3.14会被截取为3
                int i = (int) 3.14;
                System.out.println("任务5:");
                System.out.println(i + "\n");

                //任务6
                System.out.println("任务6:");
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入第一个整数：");
                int i1 = sc.nextInt();
                System.out.println("请输入第二个整数：");
                int i2 = sc.nextInt();
                System.out.println("较大者为：" + (i1 > i2 ? i1 : i2));
            }
    }

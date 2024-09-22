package com.Encounter.UnitTests;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/15 13:46
 */

/**
 * 小明去超市购买 牙膏(12元)、牙刷(2元)、洗头膏(32元)、毛中(5元)、香皂(8元)这几款日用品，收银员需要手动在收银系统中录入这几款商品的价
 * 格，并在订单列表中求出它们的总价。请使用代码，完成收银系统的功能。
 */
public class TestA
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("请输入商品总数：");
                System.out.println("总价为：" + sum(sc.nextInt()));
            }

        public static int sum(int count)
            {
                Scanner sc = new Scanner(System.in);
                int sum = 0;
                for (int i = 0; i < count; i++)
                    {
                        System.out.print("请输入第" + (i + 1) + "件商品的价格：");
                        sum += sc.nextInt();
                    }
                return sum;
            }
    }

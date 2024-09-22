package com.Encounter.UnitTests;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/15 14:27
 */

/**
 * 某地出租车收费标准如下<br/>
 * ① 起步价:10元，起步里程:3公里<br/>
 * ② 车公里单价:1.8元/公里。<br/>
 * ③ 加收燃油附加费1元<br/>
 * 假如乘客行驶的里程是4公里,请设计一个方法用来计算乘客乘坐出租车应付的费用，
 */
public class TestC
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("请输入里程：");
                double money = pay(sc.nextInt());
                if (money == -1)
                    System.out.println("输入有误！");
                else
                    System.out.println("乘客应付：" + money + "元");
            }

        public static double pay(int mileage)
            {
                if (mileage > 0 && mileage <= 3)
                    return 11.0;
                else if (mileage > 3)
                    return 10.0 + (mileage - 3) * 1.8;
                else
                    return -1;
            }
    }

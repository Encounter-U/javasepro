package com.Encounter;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/14 16:55
 */

/**
 * 用户购买机票时，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠，优惠方案如下:<br/>
 * 5-10月为旺季，头等舱9折，经济舱8.5折;11月到来年4月为淡季，头等舱7折，经济舱6.5折<br/>
 * 请开发程序计算出用户当前机票的优惠价。
 */
public class Test1
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("购票系统：");
                System.out.println("头等舱输入1，经济舱输入2");
                System.out.print("请输入当前月份：");
                int month = sc.nextInt();
                System.out.print("请选择舱类：");
                int type = sc.nextInt();
                System.out.println("请输入原票价：");
                double money = sc.nextDouble();
                System.out.println("您的票价最终为" + price(money, month, type));
            }

        public static double price(double price, int month, int type)
            {
                if (month < 0 || month > 12)
                    {
                        System.out.println("月份有误！");
                        return -1;
                    }
                if (month >= 5 && month <= 10)
                    {
                        switch (type)
                            {
                                case 1:
                                    price *= 0.9;
                                    break;
                                case 2:
                                    price *= 8.5;
                                    break;
                                default:
                                    System.out.println("输入有误，请重新输入！");
                            }
                    }
                else
                    {
                        switch (type)
                            {
                                case 1:
                                    price *= 0.7;
                                    break;
                                case 2:
                                    price *= 6.5;
                                    break;
                                default:
                                    System.out.println("输入有误，请重新输入！");
                                    return -1;
                            }
                    }
                return price;
            }
    }

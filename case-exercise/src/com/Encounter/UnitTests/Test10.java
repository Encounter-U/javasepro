package com.Encounter.UnitTests;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/13 11:08
 */
public class Test10
    {
        public static void main(String[] args)
            {
                //任务1
                Scanner sc = new Scanner(System.in);
                System.out.println("任务1：");
                System.out.print("请输入您的成绩：");
                int score = sc.nextInt();
                if (score >= 90)
                    {
                        System.out.println("优秀");
                    }
                else if (score >= 60 && score < 90)
                    {
                        System.out.println("一般");
                    }
                else
                    {
                        System.out.println("不及格");
                    }
                //任务2
                System.out.println("任务2：");
                System.out.print("请输入一个数字：");
                int num = sc.nextInt();
                switch (num)
                    {
                        case 1:
                            System.out.println("星期一");
                            break;
                        case 2:
                            System.out.println("星期二");
                            break;
                        case 3:
                            System.out.println("星期三");
                            break;
                        case 4:
                            System.out.println("星期四");
                            break;
                        case 5:
                            System.out.println("星期五");
                            break;
                        case 6:
                            System.out.println("星期六");
                            break;
                        case 7:
                            System.out.println("星期天");
                            break;
                        default:
                            System.out.println("输入错误");
                    }
                //任务3
                System.out.println("任务3：");
                for (int i = 0; i <= 100; i+=2)
                    {
                        System.out.println(i);
                    }
            }
    }

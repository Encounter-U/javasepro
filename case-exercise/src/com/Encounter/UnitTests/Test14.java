package com.Encounter.UnitTests;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/13 15:41
 */
public class Test14
    {
        /**
         * 设计一个程序，帮助小学生练习10以内的加法，要求如下:
         * ①每次随机生成1道加法算式题目，显示在控制台上，学生在控制台査看题目并输入答案，当输入的答案正确时提示“回答正确”
         * 否则提示“回答错误”
         * ② 统计学生答对次数，答对5题时，提示“练习的很棒,程序结束!” 程序结束.。
         * @param args
         */
        public static void main(String[] args)
            {
                int count = 0;
                Random r = new Random();
                Scanner sc = new Scanner(System.in);
                while (count < 5)
                    {
                        int num1 = r.nextInt(10);
                        int num2 = r.nextInt(10);
                        int result = num1 + num2;
                        System.out.print(num1 + "+" + num2 + "=");
                        int input = sc.nextInt();
                        if (input == result)
                            {
                                System.out.println("回答正确");
                                count++;
                            }
                        else
                            System.out.println("回答错误");
                    }
                System.out.println("练习的很棒,程序结束!");
            }
    }

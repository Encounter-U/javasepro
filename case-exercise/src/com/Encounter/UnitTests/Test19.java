package com.Encounter.UnitTests;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/13 19:11
 */
public class Test19
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                int[] scores = new int[5];
                for (int i = 0; i < scores.length; i++)
                    {
                        System.out.print("请输入成绩：");
                        scores[i] = sc.nextInt();
                    }
                double sum = 0;
                for (int i = 0; i < scores.length; i++)
                    {
                        sum += scores[i];
                    }
                System.out.println("平均成绩：" + sum / scores.length);
            }
    }

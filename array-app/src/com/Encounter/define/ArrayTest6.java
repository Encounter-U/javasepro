package com.Encounter.define;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/13 18:47
 */
public class ArrayTest6
    {
        public static void main(String[] args)
            {
                double[] scores = new double[6];
                Scanner sc = new Scanner(System.in);
                double sum = 0;
                for (int i = 0; i < scores.length; i++)
                    {
                        System.out.print("请输入评分:");
                        scores[i] = sc.nextDouble();
                        sum += scores[i];
                    }
                System.out.println("最终评分：" + sum / scores.length);
            }
    }

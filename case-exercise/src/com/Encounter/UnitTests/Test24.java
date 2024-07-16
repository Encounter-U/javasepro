package com.Encounter.UnitTests;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/13 21:49
 */
public class Test24
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                double[] scores = new double[5];
                for (int i = 0; i < scores.length; i++)
                    {
                        System.out.print("输入评分:");
                        scores[i] = sc.nextDouble();
                    }
                double max = scores[0];
                double min = scores[0];
                double sum = 0;
                for (int i = 0; i < scores.length; i++)
                    {
                        sum += scores[i];
                        if (max < scores[i])
                            max = scores[i];
                        if (min > scores[i])
                            min = scores[i];
                    }
                System.out.println("最终得分为：" + (sum - max - min) / 3);
            }
    }

package com.Encounter.UnitTests;

import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/14 11:58
 */
public class Test25
    {
        public static void main(String[] args)
            {
                Random r = new Random();
                System.out.println("任务1：");
                printNum();
                System.out.println();
                System.out.println("任务2：");
                sum(r.nextInt(100) + 1);
            }

        public static void printNum()
            {
                for (int i = 1; i <= 100; i++)
                    {
                        System.out.print(i + " ");
                    }
            }

        public static void sum(int a)
            {
                int sum = 0;
                for (int i = 1; i <= a; i++)
                    {
                        sum += i;
                    }
                System.out.println(sum);
            }
    }

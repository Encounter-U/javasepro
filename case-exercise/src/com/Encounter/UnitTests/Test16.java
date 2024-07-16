package com.Encounter.UnitTests;

import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/13 16:50
 */
public class Test16
    {
        public static void main(String[] args)
            {
                //任务1
                int i = 1;
                System.out.println("任务1：");
                while (true)
                    {
                        System.out.print(i + " ");
                        if (i == 30)
                            break;
                        i++;
                    }
                System.out.println();

                //任务2
                int j = 1;
                Random r = new Random();
                System.out.println("任务2：");
                while (true)
                    {
                        if (j % 2 == 0)
                            System.out.print(r.nextInt(90) + 10 + " ");
                        else
                            System.out.print(j + " ");
                        if (j == 30)
                            break;
                        j++;
                    }
                System.out.println();

                //任务3
                int height = 8848860;
                double thickness = 0.1;
                int count = 0;
                System.out.println("任务3：");
                while (thickness <= height)
                    {
                        thickness *= 2;
                        count++;
                    }
                System.out.println("共需折纸" + count + "次");
            }
    }

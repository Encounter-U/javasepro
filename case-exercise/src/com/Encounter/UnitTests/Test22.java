package com.Encounter.UnitTests;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/13 21:35
 */
public class Test22
    {
        public static void main(String[] args)
            {
                //任务1
                int[] arr1 = new int[10];
                int[] arr2 = arr1;
                Scanner sc = new Scanner(System.in);
                System.out.println("任务1：");
                for (int i = 0; i < arr1.length; i++)
                    {
                        System.out.print("输入一个整数：");
                        arr1[i] = sc.nextInt();
                    }
                int max = arr1[0];
                for (int i = 0; i < arr1.length; i++)
                    {
                        if (max < arr1[i])
                            max = arr1[i];
                    }
                System.out.println("数组中最大值为：" + max + "\n");

                //任务2
                arr2[0] = 100;
                System.out.println("任务2：");
                for (int i = 0; i < arr2.length; i++)
                    {
                        System.out.print(arr2[i] + " ");
                    }
            }
    }

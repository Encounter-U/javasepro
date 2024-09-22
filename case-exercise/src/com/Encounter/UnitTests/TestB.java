package com.Encounter.UnitTests;

import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/15 13:56
 */

/**
 * 设计一个程序，实现数组元素出现次数统计功能，具体如下:<br/>
 * ① 定义一个长度为10的数组，里面存放0-5之间的随机数，并输出显示数组内容到控制台<br/>
 * ② 统计任务①的数组每个元素出现的次数，并输出到控制台显示，格式为:“x出现了:x次”
 */
public class TestB
    {
        public static void main(String[] args)
            {
                System.out.println("任务1：");
                int[] arr = creatArray();
                printArray(arr);
                System.out.println("任务2：");
                exist(arr);
            }

        //任务1
        public static int[] creatArray()
            {
                Random r = new Random();
                int[] arr = new int[10];
                for (int i = 0; i < arr.length; i++)
                    arr[i] = r.nextInt(6);
                return arr;
            }

        //遍历数组
        public static void printArray(int[] arr)
            {
                System.out.print("[");
                for (int i = 0; i < arr.length; i++)
                    System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
                System.out.println("]");
            }

        //任务2
        public static void exist(int[] arr)
            {
                for (int i = 0; i < 6; i++)
                    {
                        int count = 0;
                        for (int j = 0; j < arr.length; j++)
                            {
                                if (i == arr[j])
                                    count++;
                            }
                        if (count != 0)
                            System.out.println(i + "出现了：" + count + "次");
                    }
            }
    }

package com.Encounter.UnitTests;

import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/14 15:24
 */

/**
 * 定义一个类，并在类中完成如下任务:
 * ① 定义一个有参有返回值的方法，返回数组元素的最大值，在main方法中调用该方法并在控制台输出最大值
 * ② 定义一个有参有返回值的方法，实现随机数组功能(数组元素随机打乱)，返回打乱后的随机数组，
 * ③ 定义一个有参无返回值的方法，实现数组各元素在控制台输出打印功能，格式:"[1,2,3]"
 * ④ 在main方法中将任务①定义的数组，作为参数调用任务②返回的随机数组 使用任务③ 的数组打印方法，将随机后的数组打印输出在控制台上
 * 6)定义两个名为sum的方法，方法1参数为两个int类型，该方法返回两个int类型变量相加的和，方法2为一个int类型，一个double类型，该方法
 * 返回两个参数的乘积，在main中分别调用两个方法sum(1,2)、sum(1,2.0) 并输出调用结果到控制台上。
 */
public class Test29
    {
        public static void main(String[] args)
            {
                int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
                System.out.println("任务1：");
                System.out.println(arrayMax(arr));
                System.out.println("任务2、任务3：");
                printArray(turbulence(arr));
                System.out.println("任务4：实现任务1、2、3");
                System.out.println("任务5：");
                System.out.println(sum(1, 2));
                System.out.println(sum(1, 2.0));
            }

        //任务1 返回数组最大值
        public static int arrayMax(int[] arr)
            {
                if (arr == null)
                    {
                        System.out.println("数组为空！");
                        return -1;
                    }
                int max = arr[0];
                for (int i = 0; i < arr.length; i++)
                    {
                        if (max < arr[i])
                            max = arr[i];
                    }
                return max;
            }

        //任务2 打乱数组
        public static int[] turbulence(int[] arr)
            {
                if (arr == null)
                    {
                        System.out.println("数组为空！");
                        return null;
                    }
                Random r = new Random();
                int temp;
                for (int i = 0; i < arr.length; i++)
                    {
                        int num = r.nextInt(arr.length);
                        temp = arr[i];
                        arr[i] = arr[num];
                        arr[num] = temp;
                    }
                return arr;
            }

        //任务3 打印
        public static void printArray(int[] arr)
            {
                if (arr == null)
                    {
                        System.out.println("数组为空！");
                        return;
                    }
                System.out.print("[");
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
                    }
                System.out.println("]");
            }

        //任务5
        public static int sum(int a, int b)
            {
                return a + b;
            }

        public static double sum(int a, double b)
            {
                return a * b;
            }
    }

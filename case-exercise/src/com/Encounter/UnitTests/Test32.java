package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/14 16:22
 */
//基本类型的参数传递和引用类型的参数传递的区别是什么？
public class Test32
    {
        public static void main(String[] args)
            {
                int a =20;
                num(a);
                System.out.println("main:"+a);
                int[] arr={10,20};
                array(arr);
                System.out.println();
                System.out.println("main:");
                printArray(arr);
            }
        public static void printArray(int[] arr)
            {
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(arr[i]+" ");
                    }
            }
        public static int[] array(int[] arr)
            {
                arr[0]=100;
                System.out.println("方法内：");
                printArray(arr);
                return arr;
            }
        public static void num(int a)
            {
                a=100;
                System.out.println("方法内："+a);
            }
    }

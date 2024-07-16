package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/14 13:32
 */
public class Test27
    {
        /**
         * 定义方法遍历数组
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr = {10, 20, 30};
                printArr(arr);
                int[] arr2 = null;
                printArr(arr2);
                int[] arr3 = {};
                printArr(arr3);
            }

        /*public static void printArr(int[] arr)
            {
                for (int i = 0; i < arr.length; i++)
                    {
                        if (i == 0)
                            System.out.print("[" + arr[i] + ",");
                        else if (i == arr.length - 1)
                            System.out.print(arr[i] + "]");
                        else
                            System.out.print(arr[i] + ",");
                    }
            }*/

        public static void printArr(int[] arr)
            {
                if (arr == null)
                    {
                        System.out.println(arr);
                        return;//跳出当前方法
                    }
                System.out.print("[");
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
                    }
                System.out.println("]");
            }
    }

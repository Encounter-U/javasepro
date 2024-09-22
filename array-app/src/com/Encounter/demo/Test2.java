package com.Encounter.demo;

/**
 * @author Encounter
 * @date 2024/6/13 19:44
 */
public class Test2
    {
        public static void main(String[] args)
            {
                int[] arr = {10, 20, 30, 40, 50};
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(arr[i] + " ");
                    }
                System.out.println();
                int temp;
                //第一种方法
                for (int i = 0; i < arr.length / 2; i++)
                    {
                        temp = arr[i];
                        arr[i] = arr[arr.length - i - 1];
                        arr[arr.length - i - 1] = temp;
                    }
                //第二种方法
                for (int i = 0, j = arr.length - 1; i < j; i++, j--)
                    {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(arr[i] + " ");
                    }
            }
    }

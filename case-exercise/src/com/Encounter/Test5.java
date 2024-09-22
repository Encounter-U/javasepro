package com.Encounter;

/**
 * @author Encounter
 * @date 2024/6/14 18:42
 */

/**
 * 请把一个整型数组，例如存了数据:11，22，33，拷贝成一个一一样的新数组出来。
 */
public class Test5
    {
        public static void main(String[] args)
            {
                int[] arr = {10, 20, 30};
                int[] arr2 = copy(arr);
                printArray(arr2);
                System.out.println();
                System.out.println(arr);
                System.out.println(arr2);
            }

        //拷贝
        public static int[] copy(int[] arr1)
            {
                int[] arr2 = new int[arr1.length];
                for (int i = 0; i < arr1.length; i++)
                    arr2[i] = arr1[i];
                return arr2;
            }

        //遍历
        public static void printArray(int[] arr)
            {
                for (int j : arr)
                    {
                        System.out.print(j + " ");
                    }
            }
    }

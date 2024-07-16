package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/14 13:46
 */
public class Test28
    {
        /**
         * 判断两个int类型数组是否相同
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr1 = {10, 20, 30};
                int[] arr2 = {10, 20, 30};
                int[] arr3 = {10, 20};
                int[] arr4 = {10, 20, 50};
                int[] arr5 = null;
                int[] arr6 = null;
                System.out.println(contrast(arr1, arr2));
                System.out.println(contrast(arr1, arr3));
                System.out.println(contrast(arr1, arr4));
                System.out.println(contrast(arr5, arr6));

            }

        /**
         * 无序
         * @param arr1
         * @param arr2
         * @return
         */
        /*public static boolean contrast(int[] arr1, int[] arr2)
            {
                if (arr1.length != arr2.length)
                    {
                        System.out.println("两数组不一样");
                        return false;
                    }
                int count = 0;
                for (int i = 0; i < arr1.length; i++)
                    {
                        boolean flag = false;//默认无相同
                        for (int j = 0; j < arr2.length; j++)
                            {
                                if (arr1[i] == arr2[j])
                                    flag = true;//若有相同的改为true
                            }
                        if (flag)
                            count++;
                        else
                            {
                                System.out.println("两数组不一样");
                                return false;
                            }
                    }
                if (count == arr1.length)
                    {
                        System.out.println("两数组相同");
                    }
                return true;
            }
*/

        /**
         * 有序
         *
         * @param arr1
         * @param arr2
         * @return
         */
        public static boolean contrast(int[] arr1, int[] arr2)
            {
                if (arr1 == null && arr2 == null)
                    return true;
                if (arr1.length != arr2.length)
                    return false;
                for (int i = 0; i < arr1.length; i++)
                    {
                        if (arr1[i] != arr2[i])
                            return false;
                    }
                return true;
            }
    }

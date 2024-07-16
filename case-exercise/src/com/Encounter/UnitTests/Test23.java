package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/13 21:43
 */
public class Test23
    {
        public static void main(String[] args)
            {
                int[] arr1 = {10, 34, 56, 12, 100};
                int[] arr2 = new int[5];
                for (int i = 0; i < arr1.length; i++)
                    arr2[i] = arr1[i];
                System.out.print("arr1:");
                for (int i = 0; i < arr1.length; i++)
                    System.out.print(arr1[i] + " ");
                System.out.println();
                System.out.print("arr2:");
                for (int i = 0; i < arr2.length; i++)
                    System.out.print(arr2[i] + " ");
            }
    }

package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/13 19:04
 */
public class Test18
    {
        public static void main(String[] args)
            {
                //任务1
                int[] arr = {10, 20, 30, 40, 50};
                //任务2
                System.out.println("任务2：");
                System.out.println(arr[2]);
                //任务3
                int[] arr2 = new int[5];
                arr2[0] = 60;
                arr2[1] = 70;
                arr2[2] = 80;
                arr2[3] = 90;
                arr2[4] = 100;
                //任务4
                System.out.println("任务4：");
                for (int i = 0; i < arr2.length; i++)
                    {
                        System.out.print(arr2[i] + " ");
                    }
            }
    }

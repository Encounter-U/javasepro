package com.Encounter.demo;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/13 20:42
 */
public class Test4
    {
        public static void main(String[] args)
            {
                int[] arr = new int[5];
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print("请输入工号：");
                        arr[i] = sc.nextInt();
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
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(arr[i] + " ");
                    }
            }
    }

package com.Encounter.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/13 16:35
 */
public class RandomTest2
    {
        public static void main(String[] args)
            {
                Random r = new Random();
                Scanner sc = new Scanner(System.in);
                int num = r.nextInt(100) + 1;
                while (true)
                    {
                        System.out.print("请输入一个数字：");
                        int a = sc.nextInt();
                        if (a == num)
                            break;
                        else
                            System.out.println(a > num ? "数值过大" : "数值过小");
                    }
            }
    }

package com.Encounter.demo;

import java.util.Random;

public class Test3
    {
        public static void main(String[] args)
            {
                Random r = new Random();
                int[] arr2 = new int[5];
                int count = 0;

                while (count < 5)
                    {
                        int num = r.nextInt(5) + 1;

                        //要放在内部初始化
                        boolean flag = false;
                        for (int j = 0; j < count; j++)
                            {
                                if (num == arr2[j])
                                    {
                                        flag = true;
                                        break;
                                    }
                            }

                        if (!flag)
                            {
                                arr2[count] = num;
                                count++;
                            }
                    }

                System.out.print("生成的数组：");
                for (int i = 0; i < arr2.length; i++)
                    {
                        System.out.print(arr2[i] + " ");
                    }
            }
    }

package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/13 21:23
 */
public class Test21
    {
        public static void main(String[] args)
            {
                double[] arr = {10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5};
                int count1 = 0;
                int count2 = 0;
                for (int i = 0; i < arr.length; i++)
                    {
                        if (arr[i] > 0)
                            count1++;
                        else
                            count2++;
                    }
                System.out.println("挣钱的有：" + count1);
                System.out.println("亏钱的有：" + count2);
            }
    }

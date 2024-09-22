package com.Encounter.define;

/**
 * @author Encounter
 * @date 2024/6/13 18:32
 */
public class ArrayTest4
    {
        /**
         * 数组元素求和
         * @param args
         */
        public static void main(String[] args)
            {
                int[] sales = {26,16,36,6,100};
                int sum = 0;
                for (int i = 0; i < sales.length; i++)
                    {
                        sum+=sales[i];
                    }
                System.out.println(sum);
            }
    }

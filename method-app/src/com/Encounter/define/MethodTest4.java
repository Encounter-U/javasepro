package com.Encounter.define;

/**
 * @author Encounter
 * @date 2024/6/14 11:37
 */
public class MethodTest4
    {
        /**
         * 求1到n的和
         * @param args
         */
        public static void main(String[] args)
            {
                System.out.println(sum(5));
            }

        public static int sum(int a)
            {
                int sum=0;
                for (int i = 1; i <= a; i++)
                    {
                        sum += i;
                    }
                return sum;
            }
    }

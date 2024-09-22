package com.Encounter.define;

/**
 * @author Encounter
 * @date 2024/6/14 10:57
 */
public class MethodDemo1
    {
        /**
         * 掌握定义方法的完整格式，搞清楚方法的好处
         * 两数求和
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int a=10;
                int b=20;
                System.out.println(sum(10, 20));
            }

        public static int sum(int a, int b)
            {
                return a + b;
            }
    }

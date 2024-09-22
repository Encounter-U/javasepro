package com.Encounter.overload;

/**
 * @author Encounter
 * @date 2024/6/14 14:08
 */
public class MethodOverLoadDemo1
    {
        /**
         * 方法重载
         *
         * @param args
         */
        public static void main(String[] args)
            {
                test();
                test(2);
            }

        public static void test()
            {
                System.out.println("test1");
            }

        public static void test(int a)
            {
                System.out.println("test2");
            }

        void test(double a)
            {
                System.out.println("test3");
            }

        int test(int b, int a)
            {
                System.out.println("test4");
                return b;
            }
        int test(double a, int b)
            {
                System.out.println("test4");
                return b;
            }
        int test(int b,double a)
            {
                System.out.println("test4");
                return b;
            }
    }

package com.Encounter.parameter;

/**
 * @author Encounter
 * @date 2024/6/14 12:42
 */
public class MethodDemo1
    {
        public static void main(String[] args)
            {
                int a = 10;
                change(a);
                System.out.println(a);
            }

        public static void change(int a)
            {
                System.out.println(a);
                a = 20;
                System.out.println(a);
            }
    }

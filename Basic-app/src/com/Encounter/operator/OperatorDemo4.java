package com.Encounter.operator;

/**
 * @author Encounter
 * @date 2024/6/12 19:15
 */
public class OperatorDemo4
    {
        /**
         * 掌握关系运算符
         * @param args
         */
        public static void main(String[] args)
            {
                int a = 10;
                int b = 5;
                boolean res = a > b;
                System.out.println(res);
                System.out.println(a < b);
                System.out.println(a >= b);
                System.out.println(a <= b);
                System.out.println(a == b);
                System.out.println(a != b);
                System.out.println(a = b);//a被赋值为b
            }
    }

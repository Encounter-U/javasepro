package com.Encounter.operator;

/**
 * @author Encounter
 * @date 2024/6/12 18:47
 */
public class OperatorDemo1
    {
        /**
         * 掌握基本运算符的使用
         * / 两个整数相除，结果还是整数
         * + 可以拼接字符串
         * @param args
         */
        public static void main(String[] args)
            {
                int a = 10;
                int b = 2;
                System.out.println(a + b);
                System.out.println(a - b);
                System.out.println(a * b);
                System.out.println(a / b);
                System.out.println(5 / 2);
                System.out.println(5.0 / 2);
                System.out.println(5 % 2);
                int i = 5;
                int i2 = 2;
                System.out.println(1.0 * i / i2);

                System.out.println("--------------------------");

                //"+"做连接符
                int a1 = 10;
                System.out.println("abc" + a1);
                System.out.println(a1 + 5);
                System.out.println("abc" + a1 + 5);
                System.out.println(a1 + 'a' + "abc");//a -> 97
            }
    }

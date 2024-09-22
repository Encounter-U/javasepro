package com.Encounter.operator;

/**
 * @author Encounter
 * @date 2024/6/12 19:05
 */
public class OperatorDemo3
    {
        /**
         * 掌握赋值运算符的使用
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //  +=
                double a = 9.5;
                double b = 520;
                a += b;//a = (double)(a + b)
                System.out.println(a);

                //  -=
                a -= b;//a = (double)(a - b)
                System.out.println(a);

                //  *=
                a *= b;//a = (double)(a * b)
                System.out.println(a);

                //  /=
                a /= b;//a = (double)(a / b)
                System.out.println(a);

                //  %=
                a %= b;//a = (double)(a % b)
                System.out.println(a);

                System.out.println("==============================");

                byte c = 10;
                byte d = 20;
                //c = a + d;//错误
                c += d;//c = (byte)(c + d)
                System.out.println(c);
            }
    }

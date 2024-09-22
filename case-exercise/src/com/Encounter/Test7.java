package com.Encounter;

/**
 * @author Encounter
 * @date 2024/6/14 20:03
 */

/**
 * 判断 101-200之间有多少个素数，并输出所有素数。<br/>
 * 说明:除了1和它本身以外，不能被其他正整数整除，就叫素数<br/>
 * 比如:3、7就是素数，而9、21等等不是素数。
 */
public class Test7
    {
        public static void main(String[] args)
            {
                System.out.println(primeOrNot(2));
                System.out.println(primeNum(101, 200));
            }

        //判断是否是素数
        public static boolean primeOrNot(int a)
            {
                boolean flag = true;//默认是素数
                for (int i = 2; i < a / 2; i++)
                    {
                        if (a % i == 0)
                            flag = false;
                    }
                return flag;
            }

        //判断某一区间有多少素数
        public static int primeNum(int a, int b)
            {
                if (b < a)
                    {
                        int temp = a;
                        a = b;
                        b = temp;
                    }
                int count = 0;//素数个数
                for (int i = a; i <= b; i++)
                    {
                        if (primeOrNot(i))
                            count++;
                    }
                return count;
            }
    }

package com.Encounter.returndemo;

/**
 * @author Encounter
 * @date 2024/6/14 14:53
 */
public class ReturnDemo1
    {
        public static void main(String[] args)
            {
                System.out.println("开始。。。");
                chu(10, 20);
                chu(10, 0);
                System.out.println("结束。。。");
            }

        public static void chu(int a, int b)
            {
                if (b == 0)
                    {
                        System.out.println("数据有误，除数不能为零");
                        return;
                    }
                int c = a / b;
                System.out.println("a/b=" + b);
            }
    }

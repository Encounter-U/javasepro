package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/14 15:49
 */

/**
 * 定义一个类，并在类中完成如下任务:
 * ① 定义一个求2个数最大公约数的方法，返回值为最大公约数。在main方法中从键盘接收两个整数，调用该方法并输出最大公约数到控制台上显
 * 示。
 * ② 改进任务① 中方法的代码，如果接收的任何一个数字为0，方法返回0，并提示:“输入的数字不能为0”
 */
public class Test30
    {
        public static void main(String[] args)
            {
                System.out.println("任务1：");
                System.out.println(commonDivisorMax(11, 33));
                System.out.println("任务2：");
                System.out.println(commonDivisorMax2(0, 10));
            }

        //任务1
        public static int commonDivisorMax(int a, int b)
            {
                int min = a;
                int max = 0;
                if (a > b)
                    min = b;
                if (a % b == 0)
                    return b;
                else if (b % a == 0)
                    return a;
                else
                    {
                        for (int i = min / 2; i > 0; i--)
                            {
                                if (min % i == 0)
                                    {
                                        max = i;
                                        break;
                                    }
                            }
                    }
                return max;
            }

        //任务2
        public static int commonDivisorMax2(int a, int b)
            {
                if (a == 0 || b == 0)
                    {
                        System.out.println("输入的数字不能为0");
                        return 0;
                    }
                int min = a;
                int max = 0;
                if (a > b)
                    min = b;
                if (a % b == 0)
                    return b;
                else if (b % a == 0)
                    return a;
                else
                    {
                        for (int i = min / 2; i > 0; i--)
                            {
                                if (min % i == 0)
                                    {
                                        max = i;
                                        break;
                                    }
                            }
                    }
                return max;
            }
    }




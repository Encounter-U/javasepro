package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/12 16:41
 */
public class Test6
    {
        public static void main(String[] args)
            {
                //任务1
                char ch = 'z';
                int i = ch;
                System.out.println("任务1：");
                System.out.println(i);
                System.out.println();

                //任务2
                int i2 = 0b1110;
                int i8 = 0107;
                int i16 = 0x5b3;
                System.out.println("任务2：");
                System.out.println("二进制转十进制："+i2);
                System.out.println("八进制转十进制："+i8);
                System.out.println("十六进制转十进制："+i16);
            }
    }

package com.Encounter.type;

/**
 * @author Encounter
 * @date 2024/6/12 15:08
 */
public class TypeConversionDemo1
    {
        /**
         * 理解自动类型转换机制
         * 类型范围小的变量可以直接赋值给类型范围大的变量
         * byte < short < int < long < float < double
         * char < int
         * @param args
         */
        public static void main(String[] args)
            {
                byte a = 12;
                int b = a;// 发生了自动类型转换
                System.out.println(a);
                System.out.println(b);

                int c = 100;
                double d = c;
                System.out.println(d);

                char ch = 'a';//'a' 97 -> 00000000 01100001
                int i = ch;//自动类型转换 -> 00000000 00000000 00000000 01100001
                System.out.println(i);
            }
    }

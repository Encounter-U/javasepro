package com.Encounter.type;

/**
 * @author Encounter
 * @date 2024/6/12 15:31
 */
public class TypeConversionDemo3
    {
        /**
         * 掌握强制转换类型
         * 注意：
         *     强制类型转换可能造成数据溢出
         *     浮点型强转为整型，直接丢掉小数部分，保留整数部分返回
         * @param args
         */
        public static void main(String[] args)
            {
                int a = 20;//00000000 00000000 00000000 00010100
                byte b = (byte) a;          //强制类型转换00010100
                System.out.println(b);

                int i = 1500;//00000000 00000000 00000101 11011100
                byte j = (byte) i;                      //11011100
                System.out.println(j);

                double d = 99.9;
                int q = (int) d;
                System.out.println(q);
            }
    }

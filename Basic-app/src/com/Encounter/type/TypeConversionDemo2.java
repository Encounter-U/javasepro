package com.Encounter.type;

/**
 * @author Encounter
 * @date 2024/6/12 15:21
 */
public class TypeConversionDemo2
    {
        /**
         * 表达式的最终结果类型由表达式中的最高类型决定
         * 在表达式中，byte,short,cha是直接转换为int类型参与运算的
         * @param args
         */
        public static void main(String[] args)
            {
                byte a = 10;
                int b = 20;
                long c = 30;
                long rs = a + b + c;
                System.out.println(rs);

                double rs2 = a + b + 1.0;
                System.out.println(rs2);

                byte i = 10;
                short j = 30;
                int rs3 = i + j;
                System.out.println(rs3);

                //面试笔试题：
                byte b1 = 10;
                byte b2 = 20;
                int b3 = b1 + b2;
                System.out.println(b3);
            }
    }

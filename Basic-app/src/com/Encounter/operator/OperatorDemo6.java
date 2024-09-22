package com.Encounter.operator;

/**
 * @author Encounter
 * @date 2024/6/12 19:37
 */
public class OperatorDemo6
    {
        /**
         * 三元运算符
         * 格式：条件语句 ? true返回值 : false返回值
         * @param args
         */
        public static void main(String[] args)
            {
                double score = 98.5;
                String rs = score >= 60 ? "及格" : "不及格";
                System.out.println(rs);

                //找出两个数较大值
                int a = 10;
                int b = 20;
                int max = a > b ? a : b;
                System.out.println(max);

                //找三个数中较大值
                int c = 30;
                int max2 = max > c ? max : c;
                System.out.println(max2);

                //优先级：&& > || > ? :
                boolean b1 = true;
                boolean b2 = false;
                boolean b3 = b1 && b2 || b1 && b2;
                System.out.println(b3);//false
            }
    }

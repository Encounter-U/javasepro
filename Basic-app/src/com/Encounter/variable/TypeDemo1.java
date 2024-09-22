package com.Encounter.variable;

/**
 * @author Encounter
 * @date 2024/6/12 14:51
 */
public class TypeDemo1
    {
        public static void main(String[] args)
            {
                //整型
                byte num = 98;
                System.out.println(num);

                short num2 = 9000;

                int num3 = 123456789;

                /**
                 * 随便写一个整型字面量，默认为int类型的，该数虽未超过long的范围，但其超过了int的范围了
                 * 若希望随便写一个整型字面量是long类型的，需在后面加上L/l
                 */
                long num4 = 22222222222222222l;
                long num5 = 22222222222222222L;

                //浮点型
                //对编写一个小数字面量，默认为double类型，若希望为float类型的，需加上F/f
                float score1 = 99.5F;
                double score2 = 99.8;

                //字符型
                char ch1 = 'a';
                char ch2 = '中';

                //布尔型
                boolean b1 = true;
                boolean b2 = false;

                //引用数据类型：String
                //String代表的是字符串类型
                String str = "黑马";
                System.out.println(str);
            }
    }

package com.Encounter.operator;

/**
 * @author Encounter
 * @date 2024/6/12 19:23
 */
public class OperatorDemo5
    {
        public static void main(String[] args)
            {
                //& 前后条件都为true时才为true
                double size = 9.8;
                int stoage = 16;
                boolean rs = size >= 6.95 & stoage >= 8;
                System.out.println(rs);

                //| 前后条件有一个为true时就为true
                boolean rs1 = size >= 6.95 | stoage >= 8;
                System.out.println(rs1);

                //! 取反
                System.out.println(!true);
                System.out.println(!false);
                System.out.println(!(size >= 6.95));

                //^ 前后条件不同时才为true
                System.out.println(true ^ false);
                System.out.println(false ^ false);
                System.out.println(true ^ true);
                System.out.println(false ^ true);

                //&& 前后条件都为true时才为true 左边为false时，右边不执行
                int i = 10;
                int j = 20;
                System.out.println(i > 100 && ++j > 99);
                System.out.println(j);

                //|| 前后条件有一个为true时就为true 左边为true时，右边不执行
                int k = 10;
                int l = 20;
                System.out.println(k > 100 || ++l > 99);
                System.out.println(l);
            }
    }

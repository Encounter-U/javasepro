package com.Encounter.loop;

/**
 * @author Encounter
 * @date 2024/6/13 10:56
 */
public class ForDemo2
    {
        /**
         * 掌握使用for循环批量生产数据
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int sum = 0;
                for (int i = 0; i <= 10; i++)
                    {
                        sum += i;
                    }
                System.out.println(sum);
                int oddSum = 0;
                /*for (int i = 0; i < 100; i++)
                    {
                        if (i % 2 != 0)
                            oddSum += i;
                    }*/
                for (int i = 1; i < 100; i+=2)
                    {
                        oddSum += i;
                    }
                System.out.println(oddSum);
            }
    }

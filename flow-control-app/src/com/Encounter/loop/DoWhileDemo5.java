package com.Encounter.loop;

/**
 * @author Encounter
 * @date 2024/6/13 15:59
 */
public class DoWhileDemo5
    {
        /**
         * 掌握do...while循环的书写格式，执行流程，以及do...while循环的优缺点
         * @param args
         */
        public static void main(String[] args)
            {
                int i = 0;
                do
                    {
                        System.out.println(i);
                        i++;
                    }
                while (i < 3);

                System.out.println();
                do
                    {
                        System.out.println("Hello");
                    }
                    while (false);
            }
    }

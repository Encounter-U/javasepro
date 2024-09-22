package com.Encounter.loop;

/**
 * @author Encounter
 * @date 2024/6/13 16:10
 */
public class LoopNestedDemo7
    {
        /**
         * 循环嵌套
         *
         * @param args
         */
        public static void main(String[] args)
            {
                /*for (int i = 0; i < 3; i++)
                    {
                        for (int j = 0; j < 5; j++)
                            System.out.println("HelloWorld!");
                        System.out.println(i);
                    }
*/
                for (int i = 0; i < 3; i++)
                    {
                        for (int j = 0; j < 4; j++)
                            {
                                System.out.print("*");
                            }
                        System.out.println();
                    }
            }
    }

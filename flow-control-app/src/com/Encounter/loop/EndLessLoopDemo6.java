package com.Encounter.loop;

/**
 * @author Encounter
 * @date 2024/6/13 16:05
 */
public class EndLessLoopDemo6
    {
        /**
         * 死循环
         *
         * @param args
         */
        public static void main(String[] args)
            {
                /*for ( ; ; )
                    {
                        System.out.println("hello world1");
                    }*/
                /*while (true)
                    {
                        System.out.println("hello world2);
                    }
                */
                do
                    {
                        System.out.println("hello world3");
                    } while (true);
            }
    }

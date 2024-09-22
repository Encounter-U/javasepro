package com.Encounter.define;

/**
 * @author Encounter
 * @date 2024/6/14 11:10
 */
public class MethodDemo2
    {
        /**
         * 掌握按照方法解决的实际业务需求不同，设计出合理的方法形式解决问题
         *
         * @param args
         */
        public static void main(String[] args)
            {
                printHelloWorld(5);
            }

        /**
         * 打印num行HelloWorld!
         * @param num
         */
        public static void printHelloWorld(int num)
            {
                for (int i = 0; i < num; i++)
                    {
                        System.out.println("HelloWorld!");
                    }
            }
    }

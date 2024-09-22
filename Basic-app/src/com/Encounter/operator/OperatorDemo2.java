package com.Encounter.operator;

/**
 * @author Encounter
 * @date 2024/6/12 18:57
 */
public class OperatorDemo2
    {
        /**
         *自增自减只能操作变量，不能操作常量
         */
        public static void main(String[] args)
            {
                int a = 10;
                //a++;//a = a + 1
                //++a;
                System.out.println(a++);
                System.out.println(++a);
                System.out.println();

                //a--;
                //--a;
                System.out.println(a--);
                System.out.println(--a);
            }
    }

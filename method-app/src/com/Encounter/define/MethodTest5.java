package com.Encounter.define;

/**
 * @author Encounter
 * @date 2024/6/14 11:43
 */
public class MethodTest5
    {
        public static void main(String[] args)
            {
                System.out.println(judgeOddAndEven(18));
            }
        public static String judgeOddAndEven(int a)
            {
                String str;
                if (a%2==0)
                    str="偶数";
                else
                    str="奇数";
                return str;
            }
    }

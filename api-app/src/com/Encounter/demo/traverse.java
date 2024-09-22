package com.Encounter.demo;

/**
 * @author Encounter
 * @date 2024/6/16 15:08
 */

/**
 * 定义一个字符串"acfhtksud"，使用程序实现在控制台遍历该字符串。
 */
public class traverse
    {
        public static void main(String[] args)
            {
                String str="acfhthsud";
                for (int i = 0; i < str.length(); i++)
                    {
                        System.out.println(str.charAt(i));
                    }
            }
    }

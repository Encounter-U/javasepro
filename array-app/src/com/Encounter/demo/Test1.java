package com.Encounter.demo;

/**
 * @author Encounter
 * @date 2024/6/13 19:39
 */
public class Test1
    {
        public static void main(String[] args)
            {
                int[] scores = {15, 9000, 10000, 20000, 9500, -5};
                int max = scores[0];//建议使用数组第一个元素
                for (int i = 0; i < scores.length; i++)
                    {
                        if (scores[i] > max)
                            max = scores[i];
                    }
                System.out.println(max);
            }
    }

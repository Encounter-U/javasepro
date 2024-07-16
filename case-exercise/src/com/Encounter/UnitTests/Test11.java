package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/13 11:16
 */
public class Test11
    {
        public static void main(String[] args)
            {
                int score1 = 2;
                int score2 = 4;
                int score3 = 6;
                int score4 = 8;
                int count = 0;
                if (score1 < 5)
                    count++;
                if (score2 < 5)
                    count++;
                if (score3 < 5)
                    count++;
                if (score4 < 5)
                    count++;
                System.out.println("分数低于5分的球员一共有" + count + "位");
            }
    }

package com.Encounter.thisdemo;

/**
 * @author Encounter
 * @date 2024/6/15 15:43
 */
public class Student
    {
        double score;
        public void printThis()
            {
                System.out.println(this);
            }

        public void printPass(double score)
            {
                if (this.score>score)
                    System.out.println("上了");
                else
                    System.out.println("落榜");
            }
    }

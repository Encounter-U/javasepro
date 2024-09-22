package com.Encounter.encapsulation;

/**
 * @author Encounter
 * @date 2024/6/15 18:41
 */
public class Student
    {
        private double score;

        public void setScore(double score)
            {
                this.score = score;
            }

        public double getScore()
            {
                return score;
            }

        public void printPass()
            {
                System.out.println(score >= 60 ? "及格" : "不及格");
            }
    }

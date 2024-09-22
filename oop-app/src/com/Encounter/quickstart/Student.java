package com.Encounter.quickstart;

/**
 * @author Encounter
 * @date 2024/6/15 14:50
 */
public class Student
    {
        String name;
        double chinese;
        double math;

        public void printTotalScore()
            {
                System.out.println(name + "总成绩：" + (chinese + math));
            }

        public void printAverage()
            {
                System.out.println(name + "平均成绩：" + (chinese + math) / 2);
            }
    }

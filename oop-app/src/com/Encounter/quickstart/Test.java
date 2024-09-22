package com.Encounter.quickstart;

/**
 * @author Encounter
 * @date 2024/6/15 14:53
 */

/**
 * 面向对象变成
 */
public class Test
    {
        public static void main(String[] args)
            {
                Student s1=new Student();
                s1.name="路明非";
                s1.chinese=60;
                s1.math=70;
                s1.printTotalScore();
                s1.printAverage();

                Student s2=new Student();
                s2.name="楚子航";
                s2.chinese=120;
                s2.math=120;
                s2.printTotalScore();
                s2.printAverage();

                System.out.println(s1);
            }
    }

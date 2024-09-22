package com.Encounter.encapsulation;

/**
 * @author Encounter
 * @date 2024/6/15 18:41
 */

/**
 * 掌握封装的设计规范：合理隐藏，合理暴露
 */
public class Test
    {
        public static void main(String[] args)
            {
                Student s1=new Student();
                s1.setScore(100);
                System.out.println(s1.getScore());
            }
    }

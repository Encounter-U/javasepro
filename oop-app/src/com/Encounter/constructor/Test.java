package com.Encounter.constructor;

/**
 * @author Encounter
 * @date 2024/6/15 17:00
 */

/**
 * 认识构造器，并掌握构造器的特点，应用场景，注意事项
 */
public class Test
    {
        public static void main(String[] args)
            {
                Student s = new Student();
                Student s1 = new Student("路明非", 80);
                System.out.println(s1.name);
                System.out.println(s1.score);

                Student s2=new Student();
                s2.name="楚子航";
                s2.score=120;
                System.out.println(s2.name);
                System.out.println(s2.score);
            }
    }

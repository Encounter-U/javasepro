package com.Encounter.javabean;

/**
 * @author Encounter
 * @date 2024/6/15 18:51
 */

/**
 * 掌握实体类的书写要求，特点，应用场景
 */
public class Test
    {
        public static void main(String[] args)
            {
                Student s1=new Student();
                s1.setName("路明非");
                s1.setScore(60);

                StudentOperator so=new StudentOperator(s1);
                so.printPass();
            }
    }

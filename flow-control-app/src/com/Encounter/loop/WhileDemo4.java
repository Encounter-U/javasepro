package com.Encounter.loop;

/**
 * @author Encounter
 * @date 2024/6/13 11:52
 */
public class WhileDemo4
    {
        public static void main(String[] args)
            {
                int height = 8848860;
                double thickness = 0.1;
                int count = 0;
                while (thickness <= height)
                    {
                        thickness *= 2;
                        count++;
                    }
                System.out.println(count);
                System.out.println(thickness);
            }
    }

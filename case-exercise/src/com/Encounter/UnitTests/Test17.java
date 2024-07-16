package com.Encounter.UnitTests;

import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/13 17:11
 */
public class Test17
    {
        /**
         * 双色球
         * @param args
         */
        public static void main(String[] args)
            {
                Random r = new Random();
                String redStr = "";
                int blue = r.nextInt(15) + 1;
                for (int i = 0; i < 5; i++)
                    {
                        int red = r.nextInt(32) + 1;
                        redStr += red + "-";
                    }
                redStr += r.nextInt(32) + 1;
                System.out.println(redStr + " " + blue);
            }
    }

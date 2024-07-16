package com.Encounter.UnitTests;

import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/14 0:14
 */
public class Test171
    {
        public static void main(String[] args)
            {
                Random r = new Random();
                String redStr = "";
                int blue = r.nextInt(15) + 1;
                int count = 0;
                while (count < 6)
                    {
                        int red = r.nextInt(32) + 1;
                        if (count != 5)
                            redStr += red + "-";
                        else
                            redStr += red + " ";
                        count++;
                    }
                System.out.println(redStr + blue);
            }
    }

package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/14 12:05
 */
public class Test26
    {
        public static void main(String[] args)
            {
                System.out.println(electricity(200));
                System.out.println(electricity(300));
                System.out.println(electricity(500));
            }

        public static double electricity(int elec)
            {
                double money = 0;
                if (elec <= 240)
                    money = elec * 0.4;
                else if (elec >= 241 && elec <= 400)
                    money = 240 * 0.4 + (elec - 240) * 0.5;
                else if (elec > 400)
                    money = 240 * 0.4 + 160 * 0.5 + (elec - 400) * 0.7;
                return money;
            }
    }

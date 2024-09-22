package com.Encounter.loop;

/**
 * @author Encounter
 * @date 2024/6/13 16:20
 */
public class BreakAndContinueDemo8
    {
        /**
         * 掌握break和continue
         * @param args
         */
        public static void main(String[] args)
            {
                for (int i = 0; i < 5; i++)
                    {
                        System.out.println("我爱你");
                        if (i == 3)
                            break;
                    }
                for (int i = 0; i < 5; i++)
                    {
                        if (i == 3)
                            continue;
                        System.out.println("我爱你"+i);
                    }
            }
    }

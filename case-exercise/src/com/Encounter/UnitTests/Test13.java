package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/13 15:36
 */
public class Test13
    {
        /**
         * 有五双鞋子，鞋码分别是41、42、43、44、45，
         * 小明的脚穿42和43的鞋子都合适，请用程序判断出不符合小明脚码数的鞋子有几双。
         * @param args
         */
        public static void main(String[] args)
            {
                int count = 0;
                for (int i = 41; i < 46; i++)
                    {
                        if (i != 42 && i != 43)
                            count++;
                    }
                System.out.println("不符合小明鞋码数的鞋子有" + count + "双");
            }
    }

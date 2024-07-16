package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/13 16:49
 */
public class Test15
    {
        public static void main(String[] args)
            {
                int i = 100;
                int count = 0;
                while (i <= 999)
                    {
                        int ge = i % 10;
                        int shi = i / 10 % 10;
                        int bai = i / 10 / 10 % 10;

                        if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i)
                            {
                                System.out.println(i);
                                count++;
                            }
                        i++;
                    }
                System.out.println("水仙花数共有：" + count + "个");
            }
    }

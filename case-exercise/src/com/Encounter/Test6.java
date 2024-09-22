package com.Encounter;

import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/14 18:59
 */

/**
 * 一个大V直播时发起了抢红包活动，分别有:9、666、188、520、99999五个红包。请模拟粉丝来抽奖，按照先来先得,
 * 随机抽取，抽完即止，注意:一个红包只能被抽一次，先抽或后抽哪一个红包是随机的，示例如下(不一定是下面的顺序)
 */
public class Test6
    {
        public static void main(String[] args)
            {
                int[] reward = {9, 666, 188, 520, 9999};
                printArray(lottery(reward));
            }

        public static int[] lottery(int[] money)
            {
                Random r = new Random();
                for (int i = 0; i < money.length; i++)
                    {
                        int index = r.nextInt(money.length);
                        int temp = money[i];
                        money[i] = money[index];
                        money[index] = temp;
                    }
                return money;
            }

        //遍历
        public static void printArray(int[] arr)
            {
                for (int j : arr)
                    {
                        System.out.print(j + " ");
                    }
            }
    }

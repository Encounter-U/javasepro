package com.Encounter;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/14 17:30
 */

/**
 * 在唱歌比赛中，可能有多名评委要给选手打分，分数是[0-100]之间的整数。选手最后得分为:<br/>
 * 去掉最高分、最低分后剩余分数的平均分，请编写程序能够录入多名评委的分数，并算出选手的最终得分。
 */
public class Test3
    {
        public static void main(String[] args)
            {
                System.out.println("最终得分为：" + score(5));
            }

        public static double score(int judgesNum)
            {
                Scanner sc = new Scanner(System.in);
                int[] scores = new int[judgesNum];
                for (int i = 0; i < judgesNum; i++)
                    {
                        while (true)
                            {
                                System.out.print("第" + (i + 1) + "位评委的评分为：");
                                int score = sc.nextInt();
                                if (score > 0 && score <= 100)
                                    {
                                        scores[i] = score;
                                        break;
                                    }
                                else
                                    System.out.println("输入有误,请重新输入！");
                            }
                    }
                int sum = 0;
                int max = scores[0];
                int min = scores[0];
                for (int i = 0; i < scores.length; i++)
                    {
                        if (max < scores[i])
                            max = scores[i];
                        if (min > scores[i])
                            min = scores[i];
                        sum += scores[i];
                    }
                return 1.0 * (sum - max - min) / (judgesNum - 2);
            }
    }

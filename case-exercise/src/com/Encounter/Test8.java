package com.Encounter;

/**
 * @author Encounter
 * @date 2024/6/14 20:27
 */

import java.util.Random;
import java.util.Scanner;

/**
 * 双色球彩票系统<br/>
 * 随机抽取六红一蓝 红球1~33 篮球1~16<br/>
 * 一等奖：1000w 6+1<br/>
 * 二等奖：500w  6+0<br/>
 * 三等奖：3000  5+1<br/>
 * 四等奖：200   5+0 4+1<br/>
 * 五等奖：10    4+0 3+1<br/>
 * 六等奖：5     2+1 1+1 0+1
 */
public class Test8
    {
        public static void main(String[] args)
            {
                System.out.println("欢迎来到双色球抽奖系统！！！");
                //win(winNum(userPools(),prizePools()));
                //生成奖池
                int[] prizePools = prizePools();
                //用户抽奖
                int[] userPools = userPools();
                //判断中奖情况
                String award = winNum(userPools, prizePools);
                //输出中奖结果并展示奖池
                System.out.println("奖池为:");
                printArray(prizePools);
                win(award);
            }

        //判断数组是否有重复数据
        public static boolean repeat(int[] arr, int index, int num)
            {
                for (int i = 0; i < index; i++)
                    {
                        if (num == arr[i])
                            return true;
                    }
                return false;
            }

        //生成奖池,六红一蓝，红色无重复
        public static int[] prizePools()
            {
                Random r = new Random();
                int[] prizePools = new int[7];
                prizePools[6] = r.nextInt(16) + 1;
                for (int i = 0; i < prizePools.length - 1; )
                    {
                        int resNum = r.nextInt(33) + 1;
                        if (!repeat(prizePools, i + 1, resNum))
                            {
                                prizePools[i] = resNum;
                                i++;
                            }
                    }
                return prizePools;
            }

        //抽红蓝球，并将号码存入数组
        public static int[] userPools()
            {
                Scanner sc = new Scanner(System.in);
                int[] userPools = new int[7];
                //存入红球
                for (int i = 0; i < userPools.length - 1; )
                    {
                        System.out.print("请抽取您的第" + (i + 1) + "个红球号码（1~33）：");
                        int redNum = sc.nextInt();
                        if (redNum < 1 || redNum > 33)
                            System.out.println("你抽取的号码有误，请重新抽取！");
                        else if (repeat(userPools, userPools.length - 1, redNum))
                            System.out.println("你已抽取过该号码！");
                        else
                            {//无重复且符合规则，存入
                                userPools[i] = redNum;
                                i++;
                            }
                    }
                //存入蓝球
                while (true)
                    {
                        System.out.print("请抽取您的蓝球号码（1~16）：");
                        int blueNum = sc.nextInt();
                        if (blueNum > 0 && blueNum < 17)
                            {
                                userPools[6] = blueNum;
                                break;
                            }
                        else
                            System.out.println("你输入的号码有误，请重新输入！");
                    }
                return userPools;
            }

        //遍历
        public static void printArray(int[] arr)
            {
                System.out.print("[");
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(i == arr[arr.length - 1] ? arr[i] : arr[i] + ",");
                    }
                System.out.println("]");
            }

        //判断红蓝球中奖个数
        public static String winNum(int[] userPools, int[] prizePools)
            {
                int redCount = 0;
                for (int i = 0; i < userPools.length; i++)
                    {
                        if (!repeat(prizePools, prizePools.length, userPools[i]))
                            redCount++;
                    }
                int blueCount = userPools[userPools.length - 1] == prizePools[prizePools.length - 1] ? 1 : 0;//中奖1，没中0
                return redCount + "+" + blueCount;
            }

        //判断中奖情况
        public static void win(String award)
            {
                switch (award)
                    {
                        case "6+1" -> System.out.println("恭喜获得一等奖1000w元！");
                        case "6+0" -> System.out.println("恭喜获得二等奖500w元！");
                        case "5+1" -> System.out.println("恭喜获得三等奖3000元！");
                        case "5+0", "4+1" -> System.out.println("恭喜获得四等奖200元！");
                        case "4+0", "3+1" -> System.out.println("恭喜获得五等奖10元！");
                        case "2+1", "1+1", "0+1" -> System.out.println("恭喜获得六等奖5元！");
                        default -> System.out.println("很遗憾，您未中奖！");
                    }
            }
    }

package com.Encounter.branch;

/**
 * @author Encounter
 * @date 2024/6/13 10:39
 */
public class SwitchDemo4
    {
        /**
         * switch穿透性的作用
         *
         * @param args
         */
        public static void main(String[] args)
            {
                String week = "星期一";
                switch (week)
                    {
                        case "星期一":
                        case "星期二":
                        case "星期三":
                            System.out.println("打游戏");
                            break;
                        case "星期四":
                        case "星期五":
                        case "星期六":
                            System.out.println("吃饭");
                            break;
                        case "星期日":
                            System.out.println("星期日");
                            break;
                        default:
                            System.out.println("输入错误");
                            break;
                    }
            }
    }

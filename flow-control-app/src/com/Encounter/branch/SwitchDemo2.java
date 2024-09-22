package com.Encounter.branch;

/**
 * @author Encounter
 * @date 2024/6/13 10:26
 */
public class SwitchDemo2
    {
        public static void main(String[] args)
            {
                String week = "星期一";
                switch (week)
                    {
                        case "星期一":
                            System.out.println("星期一");
                            break;
                        case "星期二":
                            System.out.println("星期二");
                            break;
                        case "星期三":
                            System.out.println("星期三");
                            break;
                        case "星期四":
                            System.out.println("星期四");
                            break;
                        default:
                            System.out.println("输入有误");
                    }
            }
    }

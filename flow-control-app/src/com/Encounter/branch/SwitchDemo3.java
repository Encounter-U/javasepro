package com.Encounter.branch;

/**
 * @author Encounter
 * @date 2024/6/13 10:33
 */
public class SwitchDemo3
    {
        /**
         * 搞清楚switch使用时的注意事项
         * 1.switch语句中只能使用byte、short、int、char、String、枚举
         * 2.switch语句中不能使用double、float、long
         * 3.case语句中不能使用变量,必须是常量，不能重复
         * 穿透性：
         * 1.switch语句中，case语句中匹配到的语句，会执行，并且后面的语句也会执行
         * @param args
         */
        public static void main(String[] args)
            {
                int a = 10;
                double b = 10.0;
                switch (a)
                    {
                        case 10:
                            System.out.println("10");
                            break;
                        case 20:
                            System.out.println("20");
                            break;
                        default:
                            System.out.println("default");
                    }
            }
    }

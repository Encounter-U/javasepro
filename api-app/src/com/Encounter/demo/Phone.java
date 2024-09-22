package com.Encounter.demo;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/16 15:29
 */

/**
 * 小谷点了一份外卖，为了保护用户安全隐私，外卖APP对该手机号做了脱敏处理，脱敏规则如下:
 * 判断手机号是否是13开头的，如果是13开头并且手机号码是11位的话，则将手机号的第4-7位变为
 * 宋
 * 例如题目中的手机号变为136****4567。(不考虑用户录入字母和特殊字符的情况)
 * 模拟这个外卖APP中的脱敏操作，当用户输入完手机号的时候，自动进行脱敏处理，并把脱敏后的手机号打印在控制台上,
 */
public class Phone
    {
        public static void main(String[] args)
            {
                System.out.println(replace());
            }

        public static String replace()
            {
                Scanner sc = new Scanner(System.in);
                while (true)
                    {

                        System.out.println("输入要变的手机号：");
                        String num = sc.next();
                        if (num.length() == 11 && num.startsWith("13"))
                            {
                                String substring = num.substring(3, 7);
                                num = num.replace(substring,"****");
                                return num;
                            }
                        else
                            System.out.println("手机号有误,请重新输入");
                    }
            }
    }

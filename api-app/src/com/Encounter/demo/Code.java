package com.Encounter.demo;

import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/16 11:31
 */

/**
 * 实现随机产生验证码，验证码的每位可能是数字、大写字母、小写字母
 */
public class Code
    {
        public static void main(String[] args)
            {
                System.out.println(captcha(4));
            }

        public static String captcha(int count)
            {
                Random r = new Random();
                String code = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
                /*char[] captcha = code.toCharArray();
                String captchas = "";
                for (int i = 0; i < count; i++)
                    captchas += captcha[r.nextInt(captcha.length)];*/
                String captcha = "";
                for (int i = 0; i < count; i++)
                    captcha += code.charAt(r.nextInt(code.length()));
                return captcha;
            }
    }

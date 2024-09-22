package com.Encounter;

import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/14 17:19
 */

/**
 * 开发一个程序，可以生成指定位数的验证码，每位可以是数字、大小写字母
 */
public class Test2
    {
        public static void main(String[] args)
            {
                System.out.println(code(4));
            }
        /*public static String code(int count)
            {
                Random r=new Random();
                String str="";
                char[] code={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
                             'q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
                             'Q','R','S','T','U','V','W','X','Y','Z'};
                for (int i = 0; i < count; i++)
                    {
                        str+=code[r.nextInt(code.length)];
                    }
                return str;
            }*/

        public static String code(int count)
            {
                String str = "";
                Random r = new Random();
                for (int i = 0; i < count; i++)
                    {
                        int type = r.nextInt(3);//0代表数字，1代表大写字母，2代表小写
                        switch (type)
                            {
                                case 0://数字
                                    str += r.nextInt(10);
                                    break;
                                case 1://大写字母
                                    str += (char) (r.nextInt(26) + 65);
                                    break;
                                case 2://小写字母
                                    str += (char) (r.nextInt(26) + 97);
                                    break;
                            }
                    }
                return str;
            }
    }

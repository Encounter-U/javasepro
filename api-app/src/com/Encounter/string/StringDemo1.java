package com.Encounter.string;

/**
 * @author Encounter
 * @date 2024/6/16 9:48
 */

/**
 * 掌握创建String对象，并封装要处理的字符串的两种方式
 */
public class StringDemo1
    {
        public static void main(String[] args)
            {
                //直接双引号得到字符串对象，封装字符串数据
                //name里存的是地址，直接输出结果是因为经过处理的
                String name = "路明非";
                System.out.println(name);

                //new String创建字符串对象，并调用构造器初始化字符串
                String str = new String();
                System.out.println(str);

                String str2 = new String("楚子航");
                System.out.println(str2);

                char[] chs = {'路', '明', '非'};
                String str3 = new String(chs);
                System.out.println(str3);

                byte[] b = {97, 99, 100};
                String str4 = new String(b);
                System.out.println(str4);
            }
    }

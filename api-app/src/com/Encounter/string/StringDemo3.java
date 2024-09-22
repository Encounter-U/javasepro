package com.Encounter.string;

/**
 * @author Encounter
 * @date 2024/6/16 10:48
 */

/**
 * String的一些注意事项<br/>
 * 1.String的对象是不可变的字符串对象<br/>
 * ····每次试图改变字符串对象实际上是新产生了新的字符串对象了，变量每次都是指向了新<br/>
 * ····的字符串对象，之前字符串对象的内容确实是没有改变的，因此说String的对象是不可变的<br/>
 * 2.只要是以双引号给出的字符串对象，存储在常量池中，而且内容只会存储一份<br/>
 * 3.new String创建字符串对象，每次new出来的都是一个新对象，放在堆内存中<br/>
 * 4.运算得出的结果会直接存储在堆内存中，确定值会在编译时直接运算好在进行存储
 */
public class StringDemo3
    {
        public static void main(String[] args)
            {
                //1.String的对象是不可变字符串对象
                String str1 = "路明非";
                str1 += "是";
                str1 += "龙";
                System.out.println(str1);

                //2.只要是以双引号给出的字符串对象，存储在常量池中，而且内容只会存储一份
                String str2 = "abc";
                String str3 = "abc";
                System.out.println(str2 == str3);//比较地址值

                //3.new String创建字符串对象，每次new出来的都是一个新对象，放在堆内存中
                char[] chs = {'a', 'b', 'c'};
                String str4 = new String(chs);
                String str5 = new String(chs);
                System.out.println(str4 == str5);


                //运算得出的结果会直接存储在堆内存中
                String s1 = "路明非";
                String s2 = "路";
                String s3 = s2 + "明非";
                System.out.println(s1 == s3);//比较地址值 false

                //确定值会在编译时直接运算好在进行存储
                String s4 = "路" + "明" + "非";//此处存储的是路明非，而非分开存储
                System.out.println(s1 == s4);//true
            }
    }

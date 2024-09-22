package com.Encounter.literal;

/**
 * @author Encounter
 * @date 2024/6/11 19:57
 */
public class LiteralDemo
    {
        public static void main(String[] args)
            {
                //常见数据在程序中的书写格式
                //1.整数
                System.out.println(666);

                //2.小数
                System.out.println(3.14);

                //3.字符：必须用单引号括起来，有且只能有一个字符
                System.out.println('A');
                System.out.println('中');
                System.out.println('0');
                //System.out.println('中国');
                System.out.println(' ');//空字符
//                System.out.println('');
                //特殊字符：\n换行 \t制表符 \b退格 \f换页 \'单引号 \""双引号 \r回车 \0空字符
                System.out.println('中');
                System.out.println('\n');
                System.out.println('国');

                //4.字符串：必须用双引号括起来，可以有多个字符,内容随意
                System.out.println("Hello World");
                System.out.println("");
                System.out.println("    ");
                System.out.println("我");
                System.out.println("\"");

                //5.布尔值：true false
                System.out.println(true);
                System.out.println(false);
            }
    }

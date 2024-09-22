package com.Encounter.Scanner;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/12 20:04
 */
public class ScannerDemo1
    {
        public static void main(String[] args)
            {
                //导包，IDEA自动完成
                //创建对象
                Scanner sc = new Scanner(System.in);

                //调用Scanner对象的nextInt()方法，获取用户输入的整数
                System.out.println("请输入一个整数：");
                int i = sc.nextInt();//执行到这步，程序会等待用户输入一个整数，直到用户按下回车键，才会拿到数据
                System.out.println(i);

                System.out.println("请输入一个浮点数：");
                double d = sc.nextDouble();
                System.out.println(d);

                System.out.println("请输入一个字符串：");
                String s = sc.next();
                System.out.println(s + "成功！");
            }
    }

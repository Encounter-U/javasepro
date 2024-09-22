package com.Encounter.pkg;

/**
 * @author Encounter
 * @date 2024/6/16 9:30
 */

import com.Encounter.pkg.itcast.Demo1;
import com.Encounter.pkg.itcast.Demo2;
import java.util.Random;
import java.util.Scanner;

/**
 * 1.如果当前程序中，要调用自己所在包下的其他程序，可以直接调用。(同一个包下的类，互相可以直接调用);<br/>
 * 2.如果当前程序中，要调用其他包下的程序，则必须在当前程序中导包,才可以访问!导包格式:import 包名.类名;<br/>
 * 3.如果当前程序中，要调用lava提供的程序，也需要先导包才可以使用;但是lava.lang包下的程序是不需要我们导包的，可以直接使用;<br/>
 * 4.如果当前程序中，要调用多个不同包下的程序，而这些程序名正好一样，此时默认只能导入一个程序，另一个程序必须带包名访问。
 */
public class Test
    {
        public static void main(String[] args)
            {
                //1.
                Demo d = new Demo();
                d.print();

                //2.
                Demo1 d1=new Demo1();
                d1.print();

                //3.
                Scanner sc=new Scanner(System.in);
                String str="aaa";
                Random r =new Random();

                //4.
                Demo2 d2=new Demo2();
                d2.print();
                com.Encounter.pkg.itheima.Demo2 d3=new com.Encounter.pkg.itheima.Demo2();
                d3.print();
            }
    }

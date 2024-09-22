package com.Encounter.random;

import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/13 16:28
 */
public class RandomDemo1
    {
        public static void main(String[] args)
            {
                //导包
                //创建Random对象，随机数
                Random r = new Random();
                System.out.println(r.nextInt(10));//0-9
                System.out.println(r.nextInt(10)+10);//10-19
            }
    }

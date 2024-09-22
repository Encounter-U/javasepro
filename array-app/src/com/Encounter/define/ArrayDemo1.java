package com.Encounter.define;

/**
 * @author Encounter
 * @date 2024/6/13 18:12
 */
public class ArrayDemo1
    {
        /**
         * 账务数组的定义方式之一：静态初始化数组
         * 数组属于引用数据类型
         * @param args
         */
        public static void main(String[] args)
            {
                //1.数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3,...}
                int[] ages = new int[]{11, 12, 13};
                double[] scores = new double[]{88.8, 66.6, 99.9};

                //2.简化写法：数据类型[] 数组名 = {元素1,元素2,元素3,...}
                int[] age = {11, 12, 13};
                System.out.println(age);
            }
    }

package com.Encounter.variable;

/**
 * @author Encounter
 * @date 2024/6/12 12:56
 */
public class VariableDemo2
    {
        public static void main(String[] args)
            {
                //变量要先声明才能使用
                int age = 18;
                System.out.println(age);

                //变量是什么类型，就应该存什么类型的变量
                //age = 22.3;

                //变量是从定义开始到"}"截止的范围内有效，且同一个范围内，变量名不能重复
                {
                    int a = 20;
                    //int a = 201;
                    System.out.println(a);
                }
                //System.out.println(a);
                System.out.println(age);
                int a = 201;

                //变量在定义时可以不赋初值，但在使用时必须要有值
                int num;
                //System.out.println(sum);
                num = 10;
                System.out.println(num);

                //int class = 20;
            }
    }

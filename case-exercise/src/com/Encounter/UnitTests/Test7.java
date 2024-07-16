package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/12 20:21
 */
public class Test7
    {
    public static void main(String[] args) {
        int a = 1;
        a = a++;
        int b = a++;
        int c = a+ ++a * a++;

        System.out.println("a = " + a);        // 输出的结果是？
        System.out.println("b = " + b);        // 输出的结果是？
        System.out.println("c = " + c);         // 输出的结果是？
    }
}
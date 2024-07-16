package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/12 15:45
 */
public class Test4 {
    public static void main(String[] args) {
        int i = 12345;
        long l =123456789321L;
        double d = 3.14;
        boolean b = true;
        System.out.println("任务1：");
        System.out.println("int:" + i);
        System.out.println("long:" + l);
        System.out.println("double:" + d);
        System.out.println("boolean:" + b + '\n');
        int i2 = (int) d;
        System.out.println("任务2：");
        System.out.println("double转int:" + i2 + '\n');
        double d2 = i;
        System.out.println("任务3：");
        System.out.println("int转double:" + d2);

    }
}


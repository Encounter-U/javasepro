package com.Encounter.overload;

/**
 * @author Encounter
 * @date 2024/6/14 14:15
 */
public class MethodTest2
    {
        public static void main(String[] args)
            {
fire();
fire("小日本");
fire("小日本",999999999);
            }

        public static void fire()
            {
                System.out.println("发射一枚武器");
            }

        public static void fire(String str)
            {
                System.out.println("向" + str + "发射一枚武器");
            }

        public static void fire(String str, int count)
            {
                System.out.println("向" + str + "发射" + count + "枚武器");
            }
    }

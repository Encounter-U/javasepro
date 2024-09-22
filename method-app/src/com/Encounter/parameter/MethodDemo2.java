package com.Encounter.parameter;

/**
 * @author Encounter
 * @date 2024/6/14 13:27
 */
public class MethodDemo2
    {
        public static void main(String[] args)
            {
                int[] arr = {10, 20, 30};
                change(arr);
                System.out.println(arr[1]);
            }

        public static void change(int[] arrs)
            {
                System.out.println("方法一：" + arrs[1]);
                arrs[1] = 222;
                System.out.println("方法二：" + arrs[1]);
            }
    }

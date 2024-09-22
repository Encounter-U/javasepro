package com.Encounter.memory;

/**
 * @author Encounter
 * @date 2024/6/13 19:28
 */
public class ArrayDemo2
    {
        /**
         * 认识多个变量只指向同一个数组的形式，并掌握其注意事项
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr1 = {11, 22, 33};

                //将int类型的数组变量arr1赋值给int类型的数组变量arr2
                int[] arr2 = arr1;
                System.out.println(arr1);
                System.out.println(arr2);

                arr2[1] = 99;
                System.out.println(arr1[1]);

                arr2 = null;
                System.out.println(arr2);
                System.out.println(arr2[0]);
            }
    }

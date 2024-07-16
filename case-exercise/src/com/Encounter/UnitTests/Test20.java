package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/13 21:21
 */
public class Test20
    {
        public static void main(String[] args)
            {
                double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};
                double min = arr[0];
                for (int i = 0; i < arr.length; i++)
                    {
                        if (min > arr[i])
                            min = arr[i];
                    }
                System.out.println(min);
            }
    }

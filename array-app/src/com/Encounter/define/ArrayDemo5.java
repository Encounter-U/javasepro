package com.Encounter.define;

/**
 * @author Encounter
 * @date 2024/6/13 18:36
 */
public class ArrayDemo5
    {
        public static void main(String[] args)
            {
                int[] arr = new int[3];
                for (int j : arr)
                    {
                        //arr[i] = i;
                        System.out.println(j);
                    }
                char[] ch = new char[3];
                for (char c : ch)
                    {
                        //ch[i] = i;
                        System.out.println((int) c);//要先转为int类型
                    }
                short[] sh = new short[3];
                for (short value : sh)
                    {
                        //sh[i] = i;
                        System.out.println(value);//要先转为int类型
                    }
                String[] str=new String[3];
                for (String s : str)
                    {
                        System.out.println(s);
                    }
                boolean[] b=new boolean[3];
                for (boolean value : b)
                    {
                        System.out.println(value);
                    }
                double[] d=new double[3];
                for (double v : d)
                    {
                        System.out.println(v);
                    }
            }
    }

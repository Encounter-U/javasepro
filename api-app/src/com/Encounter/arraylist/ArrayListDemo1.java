package com.Encounter.arraylist;

/**
 * @author Encounter
 * @date 2024/6/16 11:55
 */

import java.util.ArrayList;

/**
 * 掌握如何创建ArrayList集合对象，并熟悉ArrayList提供的常用方法
 */
public class ArrayListDemo1
    {
        public static void main(String[] args)
            {
                //1.创建一个ArrayList的集合对象
                //ArrayList list=new ArrayList<>();
                //只存String类型
                ArrayList<String> list=new ArrayList<>();
                list.add("路明非");
                //list.add(66);
                list.add("java");
                list.add("MySQL");
                list.add("MySQL");
                System.out.println(list);

                //2.往集合中的某个索引位置处添加一个数据
                list.add(1,"楚子航");
                System.out.println(list);

                //3.根据索引获取集合中某个索引位置处的值
                String rs=list.get(1);
                System.out.println(rs);

                //4.根据集合的大小（返回集合中存储的元素个数）
                System.out.println(list.size());

                //5.根据索引删除集合中的某个元素值，并返回被删除的元素值
                System.out.println(list.remove(2));
                System.out.println(list);

                //6.直接删除某个元素值，删除成功返回true，反之返回false
                list.remove("MySQL");
                System.out.println(list);//默认删除的是第一次出现的

                //7.修改某个索引处的数据，修改后会返回原来的值给我们
                System.out.println(list.set(2, "昂热"));
                System.out.println(list);
            }
    }

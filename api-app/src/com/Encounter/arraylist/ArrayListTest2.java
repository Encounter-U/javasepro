package com.Encounter.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Encounterrr
 * @date 2024/6/16 13:14
 */

/**
 * 现在假如购物车中存储了如下这些商品:Java入门,宁夏枸杞，黑杞，人
 * 字拖，特级构杞，构杞子。现在用户不想买构杞了，选择了批量删除，请完
 * 成该需求。
 */
public class ArrayListTest2
    {
        public static void main(String[] args)
            {
                ArrayList<String> fruit = new ArrayList<>();
                fruit.add("Java入门");
                fruit.add("宁夏枸杞");
                fruit.add("黑枸杞");
                fruit.add("人字拖");
                fruit.add("特级枸杞");
                fruit.add("枸杞子");
                System.out.println(fruit);
                Scanner sc = new Scanner(System.in);
                System.out.print("输入要删除的：");
                delete(fruit, sc.next());
                System.out.println(fruit);
            }

        public static void delete(ArrayList<String> list, String str)
            {
                for (int i = 0; i < list.size(); )
                    {
                        boolean contains = list.get(i).contains(str);
                        if (contains)
                            {
                                list.remove(i);
                                continue;
                            }
                        i++;
                    }
            }
    }

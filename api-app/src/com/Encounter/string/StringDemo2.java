package com.Encounter.string;

/**
 * @author Encounter
 * @date 2024/6/16 10:20
 */
public class StringDemo2
    {
        public static void main(String[] args)
            {
                String str = "路明非";
                //1.获取字符串长度
                System.out.println(str.length());

                //2.提取字符串某个位置处的字符
                System.out.println(str.charAt(2));

                //字符串的遍历
                for (int i = 0; i < str.length(); i++)
                    {
                        System.out.print(str.charAt(i) + " ");
                    }
                System.out.println();

                //3.把字符串转为字符数组，再进行遍历
                char[] chs = str.toCharArray();
                for (int i = 0; i < chs.length; i++)
                    {
                        System.out.print(chs[i] + " ");
                    }

                //4.判断字符串内容，一样就返回true
                String str2 = new String("路明非");
                String str5 = new String("路明非");
                System.out.println("地址值：" + (str5 == str2));//false 比较的是地址值
                System.out.println(str5.equals(str2));//true

                //5.忽略大小写比较字符串
                String c1 = "12ab";
                String c2 = "12Ab";
                System.out.println(c1.equals(c2));//false
                System.out.println(c1.equalsIgnoreCase(c2));//true

                //6.截取字符串内容
                String str3 = "楚子航还能复活吗？";
                System.out.println(str3.substring(0, 7));//包前不包后

                //7.从当前索引位置截取到末尾
                System.out.println(str3.substring(5));

                //8.把字符串中的某个内容替换为新的内容，并返回新的字符串对象给我们
                String info = "这个小说真垃圾";
                System.out.println(info.replace("垃圾", "**"));

                //9.判断字符串中是否包含某个关键字，包含返回true
                String info2 = "Java是最好的编程语言，没有之一";
                System.out.println(info2.contains("java"));
                System.out.println(info2.contains("Java"));
                System.out.println(info2.contains("javaSE"));

                //10.判断字符串是否以某个字符串开头
                System.out.println(str.startsWith("路"));
                System.out.println(str.startsWith("路明"));
                System.out.println(str.startsWith("路明非"));
                System.out.println(str.startsWith("路明非2"));

                //11.把字符串按照指定内容分割成多个字符，放到一个字符串数组中返回给我们
                String dragons = "路明非，楚子航，凯撒，上杉绘梨衣，陈墨瞳，夏弥";
                String[] split = dragons.split("，");
                for (int i = 0; i < split.length; i++)
                    {
                        System.out.print(split[i] + " ");
                    }
            }
    }

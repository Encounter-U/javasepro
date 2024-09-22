package com.Encounter.demo;

/**
 * @author Encounter
 * @date 2024/6/16 15:12
 */

/**
 * 使用String s=“boxuegu”定义一个字符串“boxuequ"
 * 使用构造方法public string(original)、public string(char l chars)、public string(byte bytes)的三种不同方式再次定义三个字符串变量存
 * 储字符串"boxuegu"
 * ② 返回字符串"boxuegu"的长度，并输出到控制台上。
 * ③ 提取"boxuegu"字符串中索引2所表示的字符，并输出在控制台上。
 * ④ 定义一个字符串"BoXueGu"和"boxuegu"进行内容上(忽略大小写)的比较。
 * 如果一样就在控制台上打印true，否则打印false。
 * ⑤ 从字符串"boxuegu"截取出"xue"这个字符串，并输出在控制台上。
 * ⑥ 将"bo#xue#qu"这个字符串使用#号进行分割，并分别输出在控制台上。
 */
public class Test1
    {
        public static void main(String[] args)
            {
                //任务1
                String boxuegu = "boxuegu";
                String boxuegu1 = new String(boxuegu);
                char[] chars = {'b', 'o', 'x', 'u', 'e', 'g', 'u'};
                String boxuegu2 = new String(chars);
                byte[] bytes = {98, 111, 120, 117, 101, 103, 117};
                String boxuegu3=new String(bytes);
                System.out.println("任务1：");
                System.out.println(boxuegu);
                System.out.println(boxuegu1);
                System.out.println(boxuegu2);
                System.out.println(boxuegu3);

                //任务2
                System.out.println("任务2：");
                System.out.println(boxuegu.length());

                //任务3
                System.out.println("任务3：");
                System.out.println(boxuegu.charAt(2));

                //任务4
                System.out.println("任务4：");
                String Boxuegu="Boxuegu";
                System.out.println(boxuegu.equalsIgnoreCase(Boxuegu));

                //任务5
                System.out.println("任务5：");
                System.out.println(boxuegu.substring(2,5));

                //任务6
                System.out.println("任务6：");
                String b="bo#xue#gu";
                String[] split = b.split("#");
                for (int i = 0; i < split.length; i++)
                    {
                        System.out.print(split[i]+" ");
                    }
            }
    }

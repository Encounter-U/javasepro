package com.Encounter.movie;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/15 19:37
 */

/**
 * 展示系统中的全部电影(每部电影展示:名称、价格)。
 * 允许用户根据电影编号(id)查询出某部电影的详细信息
 */
public class Test
    {
        public static void main(String[] args)
            {

                Movie m1 = new Movie(1, "龙族", 29.8, 10.0, "路明非", "江南", "世界树");
                Movie m2 = new Movie(2, "你好，世界", 35.0, 9.9, "二次元", "宫崎骏", "动漫");
                Movie m3 = new Movie(3, "变形金刚", 30, 9.9, "optimusPrime", "杰克", "汽车人");
                Movie[] movie = {m1, m2, m3};
                Operator mo = new Operator(movie);
                mo.show();
                Scanner sc = new Scanner(System.in);
                while (true)
                    {
                        System.out.print("请输入要查询的电影（输入0退出）：");
                        int id = sc.nextInt();
                        mo.selectById(id);
                        if (id == 0)
                            {
                                System.out.println("正在退出中...");
                                break;
                            }
                    }
            }
    }

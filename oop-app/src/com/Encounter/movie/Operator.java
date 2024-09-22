package com.Encounter.movie;

/**
 * @author Encounter
 * @date 2024/6/15 19:10
 */
public class Operator
    {
        private Movie[] movie;

        public Operator()
            {
            }

        public Operator(Movie[] movie)
            {
                this.movie = movie;
            }

        public void show()
            {
                System.out.println("---------系统全部电影信息如下---------");
                for (int i = 0; i < movie.length; i++)
                    {
                        System.out.println("ID：" + movie[i].getId());
                        System.out.println("名称：" + movie[i].getName());
                        System.out.println("价格：" + movie[i].getPrice());
                        System.out.println("----------------------------------");
                    }
            }

        public void selectById(int id)
            {
                for (int i = 0; i < movie.length; i++)
                    {
                        if (movie[i].getId() == id)
                            {
                                System.out.println("ID：" + movie[i].getId());
                                System.out.println("名称：" + movie[i].getName());
                                System.out.println("价格：" + movie[i].getPrice());
                                System.out.println("评分：" + movie[i].getScore());
                                System.out.println("演员：" + movie[i].getActor());
                                System.out.println("导演：" + movie[i].getDirector());
                                System.out.println("详情介绍：" + movie[i].getInfo());
                                System.out.println("----------------------------------");
                                return;
                            }
                    }
                System.out.println("没有该影片信息");
            }
    }

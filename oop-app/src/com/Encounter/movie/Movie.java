package com.Encounter.movie;

/**
 * @author Encounter
 * @date 2024/6/15 19:09
 */
public class Movie
    {
        private int id;//id
        private String name;//名字
        private double price;//价格
        private double score;//评分
        private String actor;//演员
        private String director;//导演
        private String Info;//详情介绍

        public Movie()
            {
            }

        public Movie(int id, String name, double price, double score, String actor, String director, String info)
            {
                this.id = id;
                this.name = name;
                this.price = price;
                this.score = score;
                this.actor = actor;
                this.director = director;
                Info = info;
            }

        public int getId()
            {
                return id;
            }

        public void setId(int id)
            {
                this.id = id;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public double getPrice()
            {
                return price;
            }

        public void setPrice(double price)
            {
                this.price = price;
            }

        public double getScore()
            {
                return score;
            }

        public void setScore(double score)
            {
                this.score = score;
            }

        public String getActor()
            {
                return actor;
            }

        public void setActor(String actor)
            {
                this.actor = actor;
            }

        public String getDirector()
            {
                return director;
            }

        public void setDirector(String director)
            {
                this.director = director;
            }

        public String getInfo()
            {
                return Info;
            }

        public void setInfo(String info)
            {
                Info = info;
            }
    }

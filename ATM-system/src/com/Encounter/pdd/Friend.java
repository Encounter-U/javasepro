package com.Encounter.pdd;

/**
 * @author Encounter
 * @date 2024/6/16 22:21
 */
public class Friend
    {
        private String name;//被砍者姓名
        private int money;//总砍价金额
        private int maxBargainer;//最大砍价人数

        public Friend(String name, int money,int maxBargainer)
            {
                this.name = name;
                this.money = money;
                this.maxBargainer=maxBargainer;
            }

        public Friend()
            {
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public int getMoney()
            {
                return money;
            }

        public void setMoney(int money)
            {
                this.money = money;
            }

        public int getMaxBargainer()
            {
                return maxBargainer;
            }

        public void setMaxBargainer(int maxBargainer)
            {
                this.maxBargainer = maxBargainer;
            }
    }

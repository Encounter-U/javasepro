package com.Encounter.demo.fruit;

/**
 * @author Encounter
 * @date 2024/6/15 16:31
 */
public class Fruit
    {
        String brandName;
        int price;

        public void printInfo()
            {
                System.out.println(brandName + "==" + price + "元/斤");
            }

        public void pay(int money, String brandName)
            {
                System.out.println(money + "元可以买" + (money / price) + "斤" + brandName);
            }
    }

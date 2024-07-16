package com.Encounter.demo.arraydemo;

/**
 * @author Encounter
 * @date 2024/6/16 13:37
 */
public class cuisine
    {
        String name;
        double price;
        double specialPrice;
        String Info;

        public cuisine()
            {
            }

        public cuisine(String name, double price, double specialPrice, String info)
            {
                this.name = name;
                this.price = price;
                this.specialPrice = specialPrice;
                Info = info;
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

        public double getSpecialPrice()
            {
                return specialPrice;
            }

        public void setSpecialPrice(double specialPrice)
            {
                this.specialPrice = specialPrice;
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

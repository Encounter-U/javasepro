package com.Encounter.phone;

/**
 * @author Encounter
 * @date 2024/6/15 20:04
 */
public class Phone
    {
        private String brand;//品牌
        private double price;//价格
        private String color;//颜色

        public Phone()
            {
            }

        public Phone(String brand, double price, String color)
            {
                this.brand = brand;
                this.price = price;
                this.color = color;
            }

        public String getBrand()
            {
                return brand;
            }

        public void setBrand(String brand)
            {
                this.brand = brand;
            }

        public double getPrice()
            {
                return price;
            }

        public void setPrice(double price)
            {
                this.price = price;
            }

        public String getColor()
            {
                return color;
            }

        public void setColor(String color)
            {
                this.color = color;
            }
    }

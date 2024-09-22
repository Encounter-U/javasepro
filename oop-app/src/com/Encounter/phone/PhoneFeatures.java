package com.Encounter.phone;

/**
 * @author Encounter
 * @date 2024/6/15 20:07
 */
public class PhoneFeatures
    {
        Phone phone;
        public PhoneFeatures(Phone phone)
            {
                this.phone=phone;
            }
        public void call()
            {
                System.out.println("正在使用价格为"+phone.getPrice()+"元的"+phone.getColor()+"的"+phone.getBrand()+"手机打电话");
            }
        public void sms()
            {
                System.out.println("正在使用价格为"+phone.getPrice()+"元的"+phone.getColor()+"的"+phone.getBrand()+"手机发短信");
            }
    }

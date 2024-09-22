package com.Encounter.phone;

/**
 * @author Encounter
 * @date 2024/6/15 20:11
 */

/**
 * 定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call0)和sendMessage()两个功能。<br/>
 * 请定义出手机类，类中要有set/get方法。<br/>
 * 定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值<br/>
 * 调用对象的两个功能，打印效果如下:<br/>
 * 正在使用价格为3998元黑色的小米手机打电话<br/>
 * 正在使用价格为3998元黑色的小米手机发短信..
 */
public class Test
    {
        public static void main(String[] args)
            {
                Phone phone1=new Phone("小米",1999,"白色");
                Phone phone2=new Phone("红米",999,"梦幻蓝");
                PhoneFeatures pf1=new PhoneFeatures(phone1);
                pf1.call();
                pf1.sms();
            }
    }

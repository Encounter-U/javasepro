package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/13 15:31
 */
public class Test12
    {
        /**
         * 小明搬家想添置一套家用电器，某电商平台优惠如下：
         * ① 拼单价: 电压力锅1199(满1199减650)，空气炸锅399(满399减50)，烧水壶199(满199减30）。
         * ② 总价打6折（拼单价和折扣不能同时使用）。
         * 那么小明要买这三样东西，最少要花多少钱？
         * @param args
         */
        public static void main(String[] args)
            {
                int total = 1199 + 399 + 199;
                double planA = total - 650 - 50 - 30;
                double planB = total * 0.6;
                double min = planA > planB ? planB : planA;
                System.out.println("小明买这三样东西至少需要花费" + min + "元");
            }
    }

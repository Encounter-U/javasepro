package com.Encounter.orders;

import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/16 21:48
 */

/**
 * 完成随机产生订单号，订单号一共有4组16位符号组成，每组用横杠-隔开，每组有4位。每位可能是数字、大写字母、小写字母。例如:KomY-ST
 * Xw-s8iX-TEqK。请使用代码完成生成随机订单号的功能，并打印到控制台上。
 */
public class Order
    {
        public static void main(String[] args)
            {
                System.out.println(code());
            }

        public static String code()
            {
                String codePool = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String code = "";
                Random r = new Random();
                for (int i = 0; i < 4; i++)
                    {
                        String str = "";
                        for (int i1 = 0; i1 < 4; i1++)
                            {
                                str += codePool.charAt(r.nextInt(codePool.length()));
                            }
                        code = (i != 3 ? (str +"-"+ code) : (code + str));
                    }
                return code;
            }
    }

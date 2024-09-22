package com.Encounter;

/**
 * @author Encounter
 * @date 2024/6/14 18:18
 */

/**
 * 某系统的数字密码是一个四位数，如1983，为了安全，需要加密后再传输，加密规则是:<br/>
 * 对密码中的每位数都加5,再对10求余，最后将所有数字顺序反转，得到一串加密后的新数，请设计出满足本需求的加密程序!
 */
public class Test4
    {
        public static void main(String[] args)
            {
                System.out.println(encrypt(1000));
            }

        public static int encrypt(int psw)
            {
                if (psw > 9999 || psw < 1000)
                    {
                        System.out.println("密码有误！");
                        return 0;
                    }
                int[] password = new int[4];
                password[0] = psw % 10;
                password[1] = psw / 10 % 10;
                password[2] = psw / 10 / 10 % 10;
                password[3] = psw / 10 / 10 / 10 % 10;
                //加密
                for (int i = 0; i < password.length; i++)
                    password[i] = (password[i] + 5) % 10;
                //System.out.println(password[0] * 1000 + password[1] * 100 + password[2] * 10 + password[3]);
                //反转,直接倒过来录入即可
                /*for (int i = 0; i < password.length / 2; i++)
                    {
                        int temp = password[i];
                        password[i] = password[password.length - i - 1];
                        password[password.length - i - 1] = temp;
                    }*/
                //组合
                return password[0] * 1000 + password[1] * 100 + password[2] * 10 + password[3];
            }
    }

package com.Encounter.demo;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/16 11:19
 */

/**
 * 系统正确的登录名和密码是:itheima/123456，请在控制台开发一个登录界面，接收用户输入
 * 的登录名和密码，判断用户是否登录成功，
 * 登录成功后展示:“欢迎进入系统!”，即可停止程序
 * 注意:要求最多给用户三次登录机会，
 */
public class Login
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("--------欢迎登录--------");
                for (int i = 0; i < 3; i++)
                    {
                        System.out.print("请输入用户名：");
                        String username = sc.next();
                        System.out.print("请输入密码：");
                        String password = sc.next();
                        if (username.equals("LuMingFei") && password.equals("123"))
                            {
                                System.out.println("登陆成功！");
                                break;
                            }
                        else if (i == 2)
                            System.out.println("登陆失败！！！");
                        else
                            System.out.println("第" + (i + 1) + "次登录，账号密码有误，请重新输入！");
                    }
            }
    }

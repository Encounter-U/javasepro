package com.Encounter.pdd;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/16 22:13
 */
public class Operator
    {
        private ArrayList<User> users;//砍过价的存入该集合
        private User user = new User();//砍价者
        private Friend friend;//被砍者
        private Random r = new Random();
        private Scanner sc = new Scanner(System.in);

        public Operator(ArrayList<User> users, Friend friend)
            {
                this.users = users;
                this.friend = friend;
            }

        public void start()
            {
                while (true)
                    {
                        System.out.println("--------------->砍价帮<---------------");
                        System.out.println("1.帮好友砍一刀");
                        System.out.println("2.退出砍价帮");
                        System.out.print("请输入您的选择：");
                        String choice = sc.next();
                        switch (choice)
                            {
                                case "1" -> bargain();
                                case "2" ->
                                    {
                                        System.out.println("系统正在退出...");
                                        return;
                                    }
                                default -> System.out.println("你输入的选项有误，请重新输入！");
                            }
                    }
            }

        //帮好友砍价1次
        private void bargain()
            {
                while (true)
                    {
                        System.out.println("===============================");
                        System.out.println("是否砍价（输入砍价用户名,输入否退出）：");
                        String name = sc.next();
                        if (name.equals("否"))
                            return;
                        //砍掉的价
                        int price = 0;
                        if (exist(users, name))
                            {
                                if (users.size() >= (friend.getMaxBargainer()-1))
                                    {
                                        users.add(new User(name, friend.getMoney(), (friend.getMoney()) + user.getTotalAmount()));
                                        System.out.println("砍价成功：" + name + "为" + friend.getName() + "砍掉" + friend.getMoney() + "元");
                                        System.out.println("已砍" + (user.getTotalAmount()+friend.getMoney()) + "元，还差0元");
                                        //friend.setMoney(0);
                                        System.out.println("砍价已完成");
                                        System.out.println("===============================");
                                        show();
                                        return;
                                    }
                                price = r.nextInt(friend.getMoney()/4) + 1;
                                //被砍者的总金额-砍掉的价
                                int kanPrice = friend.getMoney() - price;
                                user.setTotalAmount(user.getTotalAmount() + price);
                                if (kanPrice <= 0)
                                    {//砍完了，结束
                                        friend.setMoney(0);
                                        user.setTotalAmount(friend.getMoney());
                                        System.out.println("砍价已完成");
                                        System.out.println("===============================");
                                        show();
                                        return;
                                    }
                                else
                                    friend.setMoney(kanPrice);
                                //存入砍价者信息
                                users.add(new User(name, kanPrice, price));
                                //显示砍价成功提示
                                System.out.println("砍价成功：" + name + "为" + friend.getName() + "砍掉" + price + "元");
                                System.out.println("已砍" + user.getTotalAmount() + "元，还差" + friend.getMoney() + "元");
                            }
                        else
                            {
                                System.out.println("您已经为" + friend.getName() + "砍过价了，不能重复砍价！");
                            }
                        show();
                    }
            }

        //遍历集合确认该用户未砍过价
        private boolean exist(ArrayList<User> users, String name)
            {
                for (int i = 0; i < users.size(); i++)
                    {
                        User user1 = users.get(i);
                        if (name.equals(user1.getUserName()))
                            return false;
                    }
                return true;
            }

        //展示已砍价信息
        private void show()
            {
                for (int i = 0; i < users.size(); i++)
                    {
                        User user1 = users.get(i);
                        if (i== (friend.getMaxBargainer()-1))
                            {
                                System.out.println(user1.getUserName() + "-----砍掉" + friend.getMoney() + "元");
                                return;
                            }
                        System.out.println(user1.getUserName() + "-----砍掉" + user1.getBargain() + "元");
                    }
            }
    }

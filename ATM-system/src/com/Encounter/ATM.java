package com.Encounter;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/16 16:37
 */
public class ATM
    {
        private ArrayList<Account> accounts = new ArrayList<>();
        private Scanner sc = new Scanner(System.in);
        private Random r = new Random();
        private Account account;//登录后的账户


        //启动系统
        public void start()
            {
                while (true)
                    {
                        System.out.println("===欢迎进入ATM系统===");
                        System.out.println("1.用户登录");
                        System.out.println("2.用户开户");
                        System.out.println("3.退出系统");
                        System.out.print("请输入您的操作：");
                        int command = sc.nextInt();
                        switch (command)
                            {
                                //用户登录
                                case 1 -> login();
                                //用户开户
                                case 2 -> add();
                                case 3 ->
                                    {
                                        System.out.println("系统正在退出中...");
                                        return;
                                    }
                                //选择错误
                                default -> System.out.println("您的选项有误，请重新输入！");
                            }
                    }
            }

        //用户开户
        private void add()
            {
                Account account = new Account();
                System.out.println("==============================");
                System.out.print("请输入您的姓名：");
                account.setUserName(sc.next());
                while (true)
                    {
                        System.out.print("请输入您的性别：");
                        char sex = sc.next().charAt(0);
                        if (sex == '男' || sex == '女')
                            {
                                account.setSex(sex);
                                break;
                            }
                        else
                            System.out.println("您输入的性别有误，请重新输入！");
                    }
                while (true)
                    {//输入两次确认密码
                        System.out.print("请输入您的密码：");
                        String firstPsw = sc.next();
                        System.out.print("请确认您的密码：");
                        String secondPsw = sc.next();
                        if (firstPsw.equals(secondPsw))
                            {
                                account.setPassword(firstPsw);
                                break;
                            }
                        else
                            System.out.println("您两次输入的密码不一致，请重新输入！");
                    }
                System.out.print("请输入每次取现额度：");
                account.setLimit(sc.nextDouble());
                String cardId = "";//初始化卡号
                while (true)
                    {//生成卡号
                        for (int i = 0; i < 8; i++)
                            {
                                cardId += r.nextInt(10);
                            }
                        //判断卡号是否已存在
                        if (exist(accounts, cardId) == null)
                            {//不存在，可以存
                                account.setCardId(cardId);
                                break;
                            }
                    }
                //存入集合
                accounts.add(account);
                //提示开户完成
                System.out.println("恭喜您，" + account.getUserName() + "，您已开户成功，您的卡号为：" + account.getCardId()
                        + "，现在已经可以登录ATM系统，请妥善保管好您的账户！！");
            }

        //判重
        private Account exist(ArrayList<Account> accounts, String cardId)
            {
                for (int i = 0; i < accounts.size(); i++)
                    {
                        Account account = accounts.get(i);
                        if (cardId.equals(account.getCardId()))
                            return account;
                    }
                return null;
            }

        //用户登录
        private void login()
            {
                if (!accounts.isEmpty())
                    {
                        while (true)
                            {
                                System.out.println("==============================");
                                System.out.print("请输入您的账号：");
                                String cardId = sc.next();
                                account = exist(accounts, cardId);
                                if (account == null)
                                    System.out.println("系统中不存在该账户卡号！");
                                else
                                    {//账号存在且正确，开始输入密码
                                        System.out.print("请输入您的密码:");
                                        String password = sc.next();
                                        if (account.getPassword().equals(password))
                                            {//进入登录界面
                                                System.out.println("恭喜您，" + account.getUserName() + "登陆成功,您的卡号为：" + cardId);
                                                AccountMenu(account);
                                                break;
                                            }
                                        else
                                            System.out.println("您输入的密码有误，请重新输入！");
                                    }
                            }
                    }
                else
                    {
                        System.out.println("=========系统登录操作=========");
                        System.out.println("系统中暂无账户，请先开户后再登录");
                    }
            }

        //用户界面
        private void AccountMenu(Account account)
            {
                while (true)
                    {
                        System.out.println("====" + account.getUserName() + "，您可以办理以下业务====");
                        System.out.println("1.查询账户");
                        System.out.println("2.存款");
                        System.out.println("3.取款");
                        System.out.println("4.转账");
                        System.out.println("5.修改密码");
                        System.out.println("6.退出");
                        System.out.println("7.注销账户");
                        System.out.print("请选择您的需求：");
                        int choice = sc.nextInt();
                        switch (choice)
                            {
                                //查询账户
                                case 1 -> select();
                                //存款
                                case 2 -> saving();
                                //取款
                                case 3 -> withdrawal();
                                //转账
                                case 4 -> transfer();
                                //修改密码
                                case 5 -> changePsw();
                                //退出
                                case 6 ->
                                    {
                                        return;
                                    }
                                //注销账户
                                case 7 ->
                                    {
                                        if (logout())
                                            return;
                                    }
                                //输入有误
                                default -> System.out.println("您输入的选项有误，请重新输入！");
                            }
                    }
            }

        //查询账户
        private void select()
            {
                System.out.println("===========================");
                System.out.println(account.getUserName() + "，您的账户详情如下：");
                System.out.println("卡号：" + account.getCardId());
                System.out.println("账户余额：" + account.getMoney());
                System.out.println("取款限额：" + account.getLimit());
            }

        //存款
        private void saving()
            {
                System.out.println("==============================");
                System.out.print("请输入您要存的金额：");
                account.setMoney(account.getMoney() + sc.nextDouble());
            }

        //取款
        private void withdrawal()
            {
                while (true)
                    {
                        System.out.println("==============================");
                        System.out.print("请输入您要取的金额：");
                        double money = sc.nextDouble();
                        if (money > account.getLimit())
                            System.out.println("您要取现的金额大于您的取现额度" + account.getLimit() + "元，请重新输入！");
                        else if (money > account.getMoney())
                            System.out.println("您要取现的金额大于您的余额" + account.getMoney() + "元，请重新输入！");
                        else if (money >= 0)
                            {
                                account.setMoney(account.getMoney() - money);
                                System.out.println("您已取出" + money + "元，您的账户余额还有" + account.getMoney() + "元。");
                                return;
                            }
                        else
                            System.out.println("您输入的金额不合法，请重新输入！");
                    }
            }

        //转账
        private void transfer()
            {
                while (true)
                    {
                        if (accounts.size() <= 1)
                            {
                                System.out.println("==============================");
                                System.out.println("账户总数不足两个，请先开户再继续操作");
                                break;
                            }
                        else if (account.getMoney() == 0)
                            {
                                System.out.println("你自己都没钱，先挣点钱再转吧");
                                return;
                            }
                        else
                            {
                                System.out.println("==============================");
                                System.out.print("请输入要转账的账号：");
                                String cardId = sc.next();
                                Account receptionAccount = exist(accounts, cardId);
                                if (receptionAccount != null)
                                    {
                                        String userName = receptionAccount.getUserName();
                                        String replace = userName.replace(userName.charAt(0), '*');
                                        System.out.println("请输入接收方" + replace + "姓名的第一个字以确认身份：");
                                        char confirm = sc.next().charAt(0);
                                        if (confirm == userName.charAt(0))
                                            {
                                                System.out.print("请输入要转账的金额：");
                                                double money = sc.nextDouble();
                                                if (money > account.getMoney())
                                                    System.out.println("账户余额不足，无法完成转账!");
                                                else if (money < 0)
                                                    System.out.println("请输入正确的金额！");
                                                else
                                                    {//更改原账户余额
                                                        account.setMoney(account.getMoney() - money);
                                                        receptionAccount.setMoney(receptionAccount.getMoney() + money);
                                                        System.out.println("您已成功转账" + money + "元，您的账户余额还有" + account.getMoney() + "元");
                                                        return;
                                                    }
                                            }
                                        else
                                            System.out.println("您输入的字符有误，无法确认身份！");
                                    }
                                else
                                    System.out.println("账号不存在，请重新输入！");
                            }
                    }
            }

        //修改密码
        private void changePsw()
            {
                while (true)
                    {
                        System.out.println("==============================");
                        System.out.print("请输入原密码：");
                        String originalPassword = sc.next();
                        if (originalPassword.equals(account.getPassword()))
                            {
                                System.out.print("请输入新密码：");
                                String newPassword = sc.next();
                                System.out.print("请重复密码：");
                                String repeatPassword = sc.next();
                                if (newPassword.equals(repeatPassword))
                                    {
                                        account.setPassword(newPassword);
                                        System.out.println("您的密码已修改成功，请重新登陆！");
                                        break;
                                    }
                            }
                        else
                            System.out.println("您输入的原密码有误，请重新输入！");
                    }
                start();
            }

        //注销账户
        private boolean logout()
            {
                while (true)
                    {
                        System.out.println("==============================");
                        if (account.getMoney() > 0)
                            {
                                System.out.println("您的账户余额不为0，无法注销！");
                                return false;
                            }
                        else
                            {
                                System.out.println("您确定要注销账户吗？（y/n）");
                                char confirm = sc.next().charAt(0);
                                if (confirm == 'y')
                                    {
                                        accounts.remove(account);
                                        System.out.println("账户已注销成功！");
                                        return true;
                                    }
                                else if (confirm == 'n')
                                    {
                                        System.out.println("账户注销已取消");
                                        return false;
                                    }
                                else
                                    System.out.println("您输入的确认信息有误，请重新输入！");
                            }
                    }
            }
    }

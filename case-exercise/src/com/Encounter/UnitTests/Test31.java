package com.Encounter.UnitTests;

/**
 * @author Encounter
 * @date 2024/6/14 16:08
 */

/**
 * 定义一个类，并在类中实现个人所得税各种计算、查询功能，要求如下:
 * ① 定义一个方法查询个人所得税税率，方法接收一个参数个人税前薪资，返回税率(小数)。
 * ② 定义一个方法査询个人所得税速算扣除金额，方法接收一个参数个人税前薪资，返回速算扣除金额。
 * ③ 定义一个方法计算个人所得税税额，方法接收一个参数返回个人所得税税额(个人所得税计算公式:个人所得税税额 = 税前薪资*适用税率-速算扣除数)
 * 税率表:
 * 1.年度不超过36000元的税率为: 3% 速算扣除数:0、
 * 2.超过36000-144000元的部分税率为:10% 速算扣除数:2520
 * 3.超过144000-300000元的部分税率为:20% 速算扣除数:16920
 * 4.超过300000-420000元的部分税率为:25% 速算扣除数:31920
 * 5.超过420000-660000元的部分税率为:30%速算扣除数:52920
 * 6.超过660000-960000元的部分税率为:35%速算扣除数:85920
 * 7.超过960000元的税率为:45%速算扣除数:181920
 */
public class Test31
    {
        public static void main(String[] args)
            {
                System.out.println(tax(960000));
            }
        //任务1 返回税率
        public static double taxRate(double salary)
            {
                if (salary <= 36000)
                    {
                        return 0.03;
                    }
                else if (salary > 36000 && salary <= 144000)
                    {
                        return 0.1;
                    }
                else if (salary > 144000 && salary <= 300000)
                    {
                        return 0.2;
                    }
                else if (salary > 300000 && salary <= 420000)
                    {
                       return 0.25;
                   }
                else if (salary > 420000 && salary <= 660000)
                    {
                        return 0.3;
                    }
                else if (salary > 660000 && salary <= 960000)
                    {
                        return 0.35;
                    }
                else
                    {
                        return 0.45;
                    }
            }

        //任务2 返回速算扣除数
        public static double taxDeduct(double salary)
            {
                if (salary <= 36000)
                    {
                        return 0;
                    }
                else if (salary > 36000 && salary <= 144000)
                    {
                        return 2520;
                    }
                else if (salary > 144000 && salary <= 300000)
                    {
                        return 16920;
                    }
                else if (salary > 300000 && salary <= 420000)
                    {
                        return 31920;
                    }
                else if (salary > 420000 && salary <= 660000)
                    {
                        return 52920;
                    }
                else if (salary > 660000 && salary <= 960000)
                    {
                        return 85920;
                    }
                else
                    {
                        return 181920;
                    }
            }

        //任务3 返回个人所得税税额
        public static double tax(double salary)
            {
                double taxRate = taxRate(salary);
                double taxDeduct = taxDeduct(salary);
                return salary * taxRate - taxDeduct;
            }
    }

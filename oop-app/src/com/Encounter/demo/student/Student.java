package com.Encounter.demo.student;

/**
 * @author Encounter
 * @date 2024/6/15 16:13
 */
public class Student
    {
        String name;
        int yuwen;
        int shuxue;
        String[] likes = new String[10];

        //遍历数组
        public void printArray(String[] str)
            {
                for (int i = 0; i < str.length; i++)
                    if (str[i] != null)
                        System.out.print(i == str.length - 1 ? str[i] : str[i] + " ");
                System.out.println();
            }

        public void printInfo()
            {
                System.out.println(name + "语文成绩：" + yuwen + "，数学成绩：" + shuxue);
                System.out.print("爱好：");
                printArray(likes);
            }
    }

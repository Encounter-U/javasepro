package com.Encounter.demo;

/**
 * @author Encounter
 * @date 2024/6/13 21:00
 */
import java.util.Random;

public class Test5
    {
    public static void main(String[] args) {
        // 创建一个长度为5的数组
        int[] randomArray = new int[5];
        int count = 0;
        Random random = new Random();

        // 生成不重复的随机数并存入数组
        while (count < 5) {
            int randomNumber = random.nextInt(5) + 1; // 生成1到5之间的随机数
            if (!contains(randomArray, randomNumber, count)) {
                randomArray[count] = randomNumber;
                count++;
            }
        }

        // 打印数组元素
        System.out.println("随机数组元素:");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
    }

    // 辅助方法：检查数组中是否包含某个值
    private static boolean contains(int[] array, int value, int count) {
        for (int i = 0; i < count; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}

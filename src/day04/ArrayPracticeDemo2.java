package day04;

import java.util.Random;

public class ArrayPracticeDemo2 {

    public static void main(String[] args) {
        /*
        需求：已知数组元素为 {8,6,3,4,5,2,7,1,9,10}
        要求：打乱数组中的数据

        思路：
        第一步：
        0索引上的数据,跟随机位置上的数据进行交换
        第二步：
        从第二步开始,重复上面的过程

        细节1：如何交换两个位置上的数据
        细节2：如何获取一个随机的索引
         */

        // 1. 定义数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Random r = new Random();

        // 2.遍历数组
        for (int i = 0; i < arr.length; i++) {
            //i:索引   arr[i]元素
            //第一次循环：i=0
            // 获取随机索引
            int randomIndex = r.nextInt(arr.length);
            // 交换两个位置元素
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        // 3.遍历数组，输出结果
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

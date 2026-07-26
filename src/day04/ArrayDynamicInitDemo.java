package day04;

import java.util.Scanner;

public class ArrayDynamicInitDemo {

    public static void main(String[] args) {

        /*
            动态初始化的格式：
                数据类型[] 数组名 = new 数据类型 [数组的长度]；

            初学者：一个循环，一个判断，只做一件事情
         */

        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.println("请输入一个整数：");
            int num = sc.nextInt();
            arr[i] = num;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }



    }
}

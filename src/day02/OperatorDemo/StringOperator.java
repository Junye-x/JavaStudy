package day02.OperatorDemo;

import java.util.Scanner;

public class StringOperator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");

        int number = sc.nextInt();
        System.out.println(number);

        int ge = number % 10;
        System.out.println("个位是："+ ge);

        int shi = number / 10 / 10;
        System.out.println("十位是：" +shi);

        int bai = number / 100 % 10;
        System.out.println("百位是：" + bai);

    }
}

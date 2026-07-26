package day03;

import java.util.Scanner;

public class ForDemo {

    public static void main(String[] args){


        /*
                累计思想 ：数字 ---> sum
                统计思想 ：count ---> 满足条件 ++
         */

        int sum = 0;
        for (int i = 1; i <=100; i++){
            if (i % 2 == 0) sum  += i;
        }
        System.out.println(sum);

        int sum1 = 0;
        for (int j = 2; j <= 100; j += 2){
            sum1 += j;
        }
        System.out.println(sum1);


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();

        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;

        int count = 0;
        for (int k = min; k <= max; k++){
            if (k % 3 == 0 && k % 5 == 0)count++;
        }

        if (count == 0) System.out.println("在"+ min + "~" + max + "之间没有满足的数字");
        else System.out.println("在"+ min + "~" + max + "之间，满足的数字有" + count + "个");


    }
}

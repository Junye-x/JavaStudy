package day02.OperatorDemo;

import java.util.Scanner;

public class logic {
    public static void main(String[] args){

          /*
                    &&：双与
                    左假就短路
                    ||：双或
                    左真就短路
                    &：单与
                    左右都要算
                    |：单或
                    左右都要算
                    !：逻辑非
                    真变假，假变真
           */
        //数字拆分
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位整数");
        int number = sc.nextInt();

        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        int qian = number / 1000 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
        System.out.println(qian);

        //判断是否为回文数
        System.out.println(qian == ge && bai == shi);

    }
}

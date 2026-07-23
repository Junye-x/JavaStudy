package day02.OperatorDemo;

import java.util.Scanner;

public class Relation {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我的身高");
        double myHeight = sc.nextDouble();
        System.out.println("请输入我好友的身高");
        double friendHeight = sc.nextDouble();

        boolean result = myHeight >= friendHeight;
        System.out.println(result);

    }
}

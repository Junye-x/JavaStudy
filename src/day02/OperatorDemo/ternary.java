package day02.OperatorDemo;

public class ternary {
    public static void main(String[] args){

        //利用三元运算符，求两个整数的较大值
        //格式：关系表达式 ？ 表达式1 ：表达式2：
        //口诀： ？前判断，？后为真，：后为假

        int a = 20;
        int b = 10;

        int max = a > b ? a : b;
        System.out.println(max);

        int c = 10;
        int d = 20;
        System.out.println(c > d ? c : d);

    }
}

package day01;

public class VariableDemo{

    public static void main(String[] args){
        /*
           变量的注意事项：
                1.只能存一个值
                2。变量名不允许重复定义
                3.变量在使用之前一定要赋值
                4.一条语句可以定义多个变量，也可以连续赋值
         */

        double a = 100;
        double b = 10;
        double c = 20;
        System.out.println(a + b +c);
        a = a + 10;
        a = a - 2;
        System.out.println(a);

    }
}
package day05;

public class MethodOverloadDemo {

    public static void main(String[] args) {

        /*
        重载：
            同一个类中，定义了多个同名的方法，这些方法具有类似的功能

            每个方法具有不同的参数类型和参数个数，这些同名的方法，就构成了重载关系

            简单理解：同一个类，方法名相同，参数不同的方法，无需看返回值。

            - 个数不同 → 方法一i：nt/ 方法二：int int

            - 类型不同 → 方法一：int/ 方法二：double

            - 顺序不同 → 方法一：int double / 方法二：double int
         */
        int a = 10;
        int b = 20;
        System.out.println(getSum(a, b));// 实参 形参一一对应的那个方法

        // 方法的重载,我们一般不会写成顺序不同的方式

    }

    /*
    public static double getSum(int a, int b) {
        return a + b;
    }*/

    /*
    public static double getSum(int a, double b) {


        return a + b;
    }*/

    public static double getSum(double a, int b) {
        return a + b;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }

}

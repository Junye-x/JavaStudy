package day04;

public class ArrayTraversalDemo {

    public static void main(String[] args) {

        /*
           数组的遍历
              定义一个整数数组，里面存储任意数据，并将数组遍历并打印
         */

        // 1.利用静态初始化定义一个数组
        int[] arr = {10, 20, 30, 40, 50};

        // 2.一个一个获取数组中的内容
        /* System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/

        // 3.使用循环，遍历数组
        /* for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }*/

        // 获取数组的长度
        // length 获取数组的长度
        // System.out.println(arr.length);

        // 5：0 ~ arr.length - 1
        /* for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }*/

        /* for (int i = 0; i < arr.length; i++) { // 0 - 4
            System.out.println(arr[i]);
        }*/

        // 遍历数组的快速生成方式
        // 数组名.fori + 回车
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

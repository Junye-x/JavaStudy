package day04;

public class ArrayAccessDemo {

    public static void main(String[] args) {

        /*
        数组中元素的访问：
        1. 获取数据
        2. 修改数据
        */

        // 1. 静态初始化创建数组
        int[] arr = {10, 20, 30, 40, 50};

        // 2. 获取数组元素：数组名[索引]
        // 索引：从0开始,连续+1，中间不间断
        // 0 1 2 3 4
        int num = arr[0];
        System.out.println(num);
        System.out.println(arr[0]);

        // 获取索引1的数据
        System.out.println(arr[1]);

        // 修改数据
        // 格式：数组名[索引] = 新数据;
        // 注意：修改完成，原来的值会被覆盖
        arr[0] = 100;

        System.out.println(arr[0]);
    }
}

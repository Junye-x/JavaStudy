package day06;

public class DeleteDataDemo {
    public static void main(String[] args) {
        /*
        给你一个数组 nums 和一个值 val，你需要删除所有数值等于 val 的元素
        举例1：
        输入：nums = [3,2,2,3]  val = 3
        输出：nums = [2,2] 剩余2个元素
        举例1：
        输入：nums = [0,1,2,2,3,0,4,2]  val = 2
        输出：nums = [0,1,4,0,3] 剩余5个元素
        */
        // 1. 定义数组
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        // 2. 定义一个变量表示要删除的数据
        int val = 2;

        // 3. 利用快慢指针去删除数据
        int slow = 0;
        int fast = 0;

        while (fast < arr.length){
            // 4. 判断当前快指针指向的元素是否为2
            if(arr[fast] != val){
                // 不相等
                // 如果快指针当前的位置不是2，那么就把这个数字存入到慢指针的位置，慢指针，快指针往后移动一位
                arr[slow] = arr[fast];
                slow++;
            }
            fast++;
        }

        // 5. 遍历数组
        for (int i = 0; i < slow; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("有效个数有:" + slow);
    }
}

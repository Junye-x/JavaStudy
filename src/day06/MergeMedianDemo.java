package day06;

public class MergeMedianDemo {
    public static void main(String[] args) {
        //给定两个正序数组arr1和arr2，请先合并数组，并找出合并之后数组的中位数。
        //定义两个数组
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4};

        double number = findMedianSortedArrays(arr1, arr2);
        System.out.println(number);
    }


    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        //把arr1和arr2里面的数据合并到一个大数组当中
        //1.定义一个大数组
        int[] arr = new int[arr1.length + arr2.length];
        //把两个小数组中的数据，放到大数组当中，而且要保证正序
        //粗暴的办法：不管顺序，直接把arr1和arr2里面的数据添加到arr中
        //添加完毕，再排序
        //思路最简单，但是效率太低
        //快捷的思路：在添加的过程中，保证顺序
        //前提：arr1，arr2必须是正序的
        //2.定义两个变量，就好比刚刚例图中的两个箭头
        int index1 = 0;
        int index2 = 0;

        //3.遍历
        for (int i = 0; i < arr.length; i++) {
            //4.如果arr1是短的
            if (index1 == arr1.length) {
                arr[i] = arr2[index2];
                index2++;
                continue;
            }
            //5.如果arr2是短的
            if (index2 == arr2.length) {
                arr[i] = arr1[index1];
                index1++;
                continue;
            }
            //判断index1指向的元素，跟index2指向的元素谁小，谁小添加谁
            if (arr1[index1] < arr2[index2]) {
                arr[i] = arr1[index1];
                index1++;
            } else {
                arr[i] = arr2[index2];
                index2++;
            }
        }

        //求中位数
        //大数组的长度是奇数还是偶数
        //元素 1 2 3  4  5  6
        //索引 0 1 2  3  4  5
        if (arr.length % 2 == 0) {
            //偶数
            int num1 = arr[arr.length / 2];
            int num2 = arr[arr.length / 2 - 1];
            return (num1 + num2) / 2.0;
        } else {
            //奇数
            //元素 1 2 3  4  5
            //索引 0 1 2  3  4
            int num = arr[arr.length / 2];
            return num / 1.0;
        }

    }
}

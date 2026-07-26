package day04;

public class ArrayDemo {

    public static void main(String[] args) {

        /*
            静态初始化

            完整格式：
                数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, 元素3, ..., 元素n};

            简写格式：
                数据类型[] 数组名 = {元素1, 元素2, 元素3, ..., 元素n};
    */

        int[] ageArr1 = new int[]{18,19,20};
        int[] ageArr2 = {18,19,20};

        double[] heightArr1 = new double[]{1.78,1.80,1.83};
        double[] heightArr2 = {1.78,1.80,1.83};

        String[] nameArr1 = new String[]{"jun","ye","x"};
        String[] nameArr2 = {"jun","ye","x"};
    }
}

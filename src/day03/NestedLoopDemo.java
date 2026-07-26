package day03;

public class NestedLoopDemo {

    public static void main(String[] args) {

        //System.out.println("*");先打印，再换行
        //System.out.print("*");只打印，不换行

        //外循环：把在一行打印N个星的事情，重复5次
        for (int i = 1; i <= 5; i++){
            //内循环：在一行打印1~5个星
            for (int k = 1; k <= i ; k++){
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
            //外循环：控制图形的行数
        for (int j = 1; j <= 3; j++){

            for (int m = j; m <= 2; m++){
                System.out.print(" ");
            }

            for (int m = 1; m <= 6; m++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

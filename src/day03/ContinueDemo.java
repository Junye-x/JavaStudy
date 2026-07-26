package day03;

public class ContinueDemo {

    public static void main(String[] args) {

        //continue:
        //   不能单独出现的，只能写在循环当中，结束本次循环，继续下次循环
        for (int i = 1; i <= 100; i++){
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }

    }
}

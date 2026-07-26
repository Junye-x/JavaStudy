package day03;

public class DoWhileDemo {

    public static void main(String[] args){

        /*
           do...while特点:
                先执行后判断，循环体至少执行一次
           for,while特点:
                先判断后执行
         */

        int i = 10;
        do {
            System.out.println("Hello World");
        }while (i <= 5);

    }
}

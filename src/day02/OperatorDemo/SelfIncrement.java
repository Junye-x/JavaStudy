package day02.OperatorDemo;

public class SelfIncrement {
    public static void main(String[] args){

        /*
        ++在前：先加，再用
        ++在后：先用，再加
        --在前：先减，再用
        --在后：先用，再减
         */
        int a = 10;
        a++;
        ++a;
        --a;
        a--;
        a--;
        System.out.println(a);


    }
}

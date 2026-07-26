package day03;

public class BreakDemo {

    public static void main(String[] args){
        /*
            break关键字：
                 不能单独出现的，只能写在switch或者循环当中，表示结束、跳出的意思

            循环的快速生成方式： 次数.fori + 回车
         */
        for (int i = 0; i < 100; i++) {
            if (i == 15){
                break;
            }
            System.out.println(i);
        }

    }

}

package day03;

public class WhileDemo {

    public static void main(String[] args){

        //问题：在银行投资了100000元，复利是1.7%，几年后能实现本金翻倍
        /*
           for:  范围  次数
           while: 结束条件
         */

        double money = 100000;
        double expectMoney = 200000;

        int year = 0;
        while (money < expectMoney){
            money += money * 0.017;
            year++;
        }
        System.out.println(year);

    }
}

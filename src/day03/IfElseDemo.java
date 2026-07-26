package day03;

public class IfElseDemo {

    public static void main(String[] args) {

        double score = 200;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("通过");
            } else {
                System.out.println("不通过");
            }
        }else {
            System.out.println("不合理");
        }

        double price = 100;
        double discountPrice = 0;

        if (price > 0) {
            if (price < 10) discountPrice = 0;
             else if (price <= 50) discountPrice = 8;
             else if (price <= 100) discountPrice =30;
             else if (price <= 200) discountPrice = 50;
             else discountPrice = 90;
        }else {
            System.out.println("商品价格有误");
        }
        System.out.println("使用优惠卷之后，可以少付的钱：" + discountPrice);
        double memberPrice = price * 0.2;
        if(discountPrice >= memberPrice){
            System.out.println("使用优惠卷的价格更低：" + (price - discountPrice));
        }else{
            System.out.println("使用会员的价格更低：" + (price - memberPrice));
        }

    }
}
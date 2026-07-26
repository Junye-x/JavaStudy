package day03;

public class SwitchCaseDemo {

    public static void main(String[] args){

        /*
               switch的注意点：
               1.表达式：结果（字符/整数/byte/ short int/枚举/字符串）---跳转表，索引不支持小数，也不支持大的整数long
               2.case：被匹配的值，只能是真实的数据
               3.case：值不允许重复
               4.break：表示中断，结束的意思，结束switch语句
               5.default：所有情况都不匹配，执行该处的内容

         */

        int number = 1;

        switch (number){
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            default:
                System.out.println("没有这个数字");
                break;
        }
    }
}

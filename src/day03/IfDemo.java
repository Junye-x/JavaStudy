package day03;

public class IfDemo {

    public static void main(String[] args){

        /*
        if的细节，
               1. If语句大括号的位置
               左括号写在上一行的末尾，不便单独写一行
                   K&R风格（紧凑风）。左括号在上一行的末尾
                   A11man风格(折叠风):左括号另起一行
                      K&R风格:
                        创造C语言的两位大神
                        布莱恩·克尼汉 Brian Kernighan
                        丹尼斯.里奇 Dennis Ritchie
                        《The C Programming Language>书里面两种风格都用到了
                        仿照大神的风格，从两个名字各取一个字母，左括号在上一行的末尾..>K&R风格
                        Java Go
                        Javai Oracle官方示例 谷歌编码规范Spring框架-->K&R风格

                      A1lman风格：
                        BSD UNIX操作系统的主要开发者艾瑞克.奥尔曼（Eric-A11man)
                        C# --> A11man风格
               2.If语句大括号的省略
               如果大括号中语句体只有一行，大括号可以省略
               3.小括号后面不能有分号
               小括号后面不能有分号，这样会折开if的语句结构
               4.判断布尔类型的变量
               判断布尔类型的变量,直接变量写在小括号中即可
         */
        double bodyTemperature = 37;

        if(bodyTemperature >=38) System.out.println("警告，温度超过38度");

        boolean b = true;
        if(b){
            System.out.println("为真");
        }



    }
}

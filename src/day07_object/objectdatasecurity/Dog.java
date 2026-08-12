package day07_object.objectdatasecurity;

public class Dog {

    /*
        1. private关键字:是一个权限修饰符可以修饰成员变量和成员方法。
        特点：被private修饰的成员只能在本类中才能访问。

        2.针对private修饰的成员变量，需提供以下操作:
        提供setXxx(参数)，给成员变量赋值，用public修饰
        提供"getxxx()"，获取成员变量的值，用public修饰
    */

    // 姓名、年龄。
    private String name;
    private int age;

    // get/set

    // name
    // value：表示将来要赋的值 小白
    public void setName(String value){
        // 给对象中的属性进行赋值
        name = value;
    }

    public String getName(){
        return name;
    }

    // age
    // num：表示将来要赋的值 2岁
    public void setAge(int num){
        // 给对象中的属性进行赋值
        if(num >= 0 && num <= 15){
            age = num;
        }else{
            System.out.println("当前的" + num + "不在合理范围之内");
        }
    }

    public int getAge(){
        return age;
    }

    //行为：吃骨头
    public void eat(){
        System.out.println(age + "岁的" + name + ",正在吃骨头");
    }

}

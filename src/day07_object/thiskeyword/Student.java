package day07_object.thiskeyword;

public class Student {
    /*
        1．就近原则
        在方法当中直接使用变量查找顺序：
        先找局部变量，再找成员变量

        2．this的作用？
        可以区别成员变量和局部变量
        System.out.println(age); // 触发就近原则
        System.out.println(this.age);// 使用成员变量
     */
    private int age;

    public void setAge(){
        int age = 10;
        // 触发就近原则
        System.out.println(age);// 10

        // 使用了上面成员变量age
        System.out.println(this.age);// 0
    }
}

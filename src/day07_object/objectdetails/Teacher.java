package day07_object.objectdetails;

public class Teacher {
    //属性
    String name;
    int age;

    //行为
    //能干什么？方法的形式进行体现（不加static）
    //授课
    public void teach(){
        System.out.println("老师在授课");
    }

    //吃饭
    public void eat(){
        System.out.println("老师在吃饭");
    }

    //睡觉
    public void sleep(){
        System.out.println("老师在睡觉");
    }

}

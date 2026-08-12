package day07_object.constructor;

public class StudentTest {
    public static void main(String[] args) {
        /*
        构造方法注意事项
        - 如果没有定义构造方法，系统将给出一个默认的无参数构造方法
        - 如果自己写了任意构造方法，系统将不再提供默认的构造方法
        - 带参构造方法和无参数构造方法，两者方法名相同，但是参数不同，这叫做构造方法的重载
        - 习惯：无论是否使用，都手动书写无参数构造方法，和带全部参数的构造方法
         */

        // 定义一个JavaBean类描述学生
        //    属性：姓名 年龄 性别 身高

        // 创建对象
        Student s = new Student();
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());
        System.out.println(s.getHeight());

        Student ss = new Student("zhangsan",23,"男",175);
        System.out.println(ss.getName());
        System.out.println(ss.getAge());
        System.out.println(ss.getGender());
        System.out.println(ss.getHeight());
    }
}

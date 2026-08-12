package day07_object.constructor;

public class Student {

    /*
    构造方法
    Student s1 = new Student();
    Student s2 = new Student("张三", 23);

    特点：
    1.方法名与类名相同，大小写也要一致
    2.没有返回值类型，连void都没有
    3.没有具体的返回值（不能由retrun带回结果数据）

    执行时机：
    1.创建对象的时候由虚拟机调用，不能手动调用构造方法
    2.每创建一次对象，就会调用一次构造方法
     */

    // 属性：姓名 年龄 性别 身高
    private String name;
    private int age;
    private String gender;
    private int height;

    // 构造方法
    // 习惯：空参
    public Student(){

    }
    // 带全部参数的构造
    public Student(String name,int age, String gender,int height){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    // set/get
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }
}

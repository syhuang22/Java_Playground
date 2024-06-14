package Basics;
class Student {
    // 封装：属性（字段）私有化
    private String name;
    private int age;

    // 构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 封装：提供公共的getter和setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 方法：计算年龄（这里假设有一个简单的计算，即返回年龄本身）
    public int calculateAge() {
        return this.age;
    }

    // 方法：打印学生信息
    public void printStudentInfo() {
        System.out.println("姓名: " + this.name);
        System.out.println("年龄: " + this.age);
    }
}
public class oopMain {
    public static void main(String[] args) {
        // 创建学生对象
        Student student = new Student("张三", 20);

        // 调用对象的方法
        student.printStudentInfo();
        System.out.println("计算年龄: " + student.calculateAge());
    }
    
}

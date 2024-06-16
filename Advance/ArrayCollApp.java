package Advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayCollApp {
    public static void main(String[] args) {
        // 创建一个ArrayList来存储学生对象
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("C", 20));
        students.add(new Student("B", 21));
        students.add(new Student("A", 19));

        // 使用Collections的sort方法和自定义的Comparator对学生按姓名排序
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        // 打印排序后的学生信息
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
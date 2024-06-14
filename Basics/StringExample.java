package Basics;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "world!";
        String concatenated = str1 + str2;
        System.out.println(concatenated); // 输出: Hello, world!

        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("world!");
        String concatenated2 = sb.toString();
        System.out.println(concatenated2); // 输出: Hello, world!

        String str = "apple,banana,cherry";
        String[] fruits = str.split(",");
        System.out.println(Arrays.toString(fruits));
        for (String fruit : fruits) {
            System.out.println(fruit.trim()); // 输出: apple, banana, cherry (trim()去除前后空格)
        }

        String str3 = "Hello, world!";
        String replaced = str3.replace("world", "Java");
        System.out.println(replaced); // 输出: Hello, Java!

        String str4 = "apple132, banana2, cherry3";
        String replaced2 = str4.replaceAll("\\d", ""); // 替换所有数字
        System.out.println(replaced2); // 输出: apple, banana, cherry
    }
}

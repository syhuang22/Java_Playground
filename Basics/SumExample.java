package Basics;

public class SumExample {
    // 定义一个方法，用于计算两个整数的和
    private static int sum(int a, int b) {
        // 计算两个数的和
        int result = a + b;
        // 返回结果
        return result;
    }
    public static void main(String[] args) {
        // 调用sum方法，并传入两个整数参数
        int sumResult = sum(5, 10);
        // 打印结果
        System.out.println("两数之和为: " + sumResult);
    }
}

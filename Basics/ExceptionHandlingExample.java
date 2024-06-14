package Basics;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int divisor = 0;

        // 尝试执行可能会抛出异常的代码
        try {
            // 可能会抛出ArrayIndexOutOfBoundsException
            System.out.println(array[2]); // 数组越界

            // 可能会抛出ArithmeticException（除以零）
            int result = 10 / divisor; // 除数为零
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            // 处理数组越界异常
            System.out.println("数组越界异常: " + e.getMessage());
        } catch (ArithmeticException e) {
            // 处理除数为零的异常
            System.out.println("除数为零异常: " + e.getMessage());
        } catch (Exception e) {
            // 捕获其他类型的异常
            System.out.println("发生其他类型的异常: " + e.getMessage());
        } finally {
            // 无论是否发生异常，finally块中的代码都会执行
            System.out.println("程序继续执行...");
        }
    }
}

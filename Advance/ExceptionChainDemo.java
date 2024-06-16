package Advance;

import java.io.IOException;

public class ExceptionChainDemo {

    public static void main(String[] args) {
        try {
            // 假设有一个可能抛出异常的方法
            someMethodThatThrowsException();
        } catch (IOException e) {
            // 捕获到IOException后，抛出一个自定义的RuntimeException，同时保留原始异常信息
            throw new MyCustomRuntimeException("A custom error occurred", e);
        }
    }

    public static void someMethodThatThrowsException() throws IOException {
        // 模拟一个可能抛出IOException的场景
        throw new IOException("An I/O error occurred");
    }

    // 自定义运行时异常，用于包装原始异常
    static class MyCustomRuntimeException extends RuntimeException {
        public MyCustomRuntimeException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}

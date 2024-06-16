package Advance;

import java.util.concurrent.*;

public class MultiThreadExceptionHandling {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Void> future = executorService.submit(() -> {
            // 模拟线程中的任务
            try {
                // ... 执行一些操作 ...
                throw new RuntimeException("An error occurred in the thread");
            } catch (Exception e) {
                // 可以在这里处理异常，但通常更好的做法是将异常抛出
                throw new RuntimeException("Thread exception wrapper", e);
            }
        });

        try {
            // 等待任务完成，并获取结果（如果线程中有未捕获的异常，这里会抛出ExecutionException）
            System.out.println("1");
            future.get();
            System.out.println("2");
        } catch (InterruptedException | ExecutionException e) {
            // 处理异常
            System.out.println("3");
            Throwable cause = e.getCause(); // 获取实际的异常原因
            cause.printStackTrace(); // 打印堆栈跟踪信息
        } finally {
            // 关闭执行器服务
            executorService.shutdown();
        }
    }
}

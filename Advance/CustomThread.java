package Advance;

public class CustomThread extends Thread {

    @Override
    public void run() {
        try {
            // 线程执行的代码
            // ... 执行一些操作 ...
            throw new RuntimeException("An error occurred in the custom thread");
        } catch (Exception e) {
            // 在这里处理异常
            e.printStackTrace();
            // 可以通过其他方式通知主线程异常发生，例如设置标志位或使用观察者模式
        }
    }

    public static void main(String[] args) {
        CustomThread thread = new CustomThread();
        thread.start();

        // 等待线程结束（这只是一个简单的示例，实际中你可能需要更复杂的同步机制）
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

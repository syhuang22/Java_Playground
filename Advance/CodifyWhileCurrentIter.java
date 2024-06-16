package Advance;

import java.util.concurrent.CopyOnWriteArrayList;

public class CodifyWhileCurrentIter {
    public static void main(String[] args) {
        // 创建一个CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        
        // 遍历集合的同时在另一个线程中修改集合
        Thread newThread = new Thread(() -> {
            list.add("New Element"); // 这不会导致ConcurrentModificationException
        });
        newThread.start();
        
        // 这里遍历集合不会抛出ConcurrentModificationException，因为CopyOnWriteArrayList在修改时复制了底层数组
        for (String element : list) {
            System.out.println("Current Element: " + element);
        }

        // 确保新线程完成
        try {
            newThread.join(); // 等待新线程结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 这里遍历集合不会抛出ConcurrentModificationException，因为CopyOnWriteArrayList在修改时复制了底层数组
        for (String element : list) {
            System.out.println("Current Element: " + element);
        }
    }
}
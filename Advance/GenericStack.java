package Advance;

public class GenericStack<T> {
    private Node<T> top;
    private int size;

    // 栈节点内部类
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    // 构造函数
    public GenericStack() {
        top = null;
        size = 0;
    }

    // 压栈操作
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // 出栈操作
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    // 查看栈顶元素
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    // 检查栈是否为空
    public boolean isEmpty() {
        return top == null;
    }

    // 获取栈的大小
    public int size() {
        return size;
    }
}

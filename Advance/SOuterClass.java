package Advance;

public class SOuterClass {
    // 静态内部类，用于记录外部类的创建次数
    private static class Counter {
        private static int count = 0;

        public static int getCount() {
            return count;
        }

        public static void increment() {
            count++;
        }
    }

    // 外部类的构造器
    public SOuterClass() {
        // 每次创建外部类实例时，增加计数
        Counter.increment();
    }

    // 获取外部类创建次数的静态方法
    public static int getCreationCount() {
        return Counter.getCount();
    }

    public static void main(String[] args) {
        // 创建几个外部类的实例
        SOuterClass instance1 = new SOuterClass();
        SOuterClass instance2 = new SOuterClass();
        SOuterClass instance3 = new SOuterClass();

        // 输出外部类的创建次数
        System.out.println("Number of OuterClass instances created: " + SOuterClass.getCreationCount());
    }
}
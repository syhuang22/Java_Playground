package Advance;

public class OuterClass {
    // 内部接口
    interface InnerInterface {
        void doSomething();
    }

    // 内部实现类
    class InnerClass implements InnerInterface {
        @Override
        public void doSomething() {
            System.out.println("Doing something in InnerClass.");
        }
    }

    // 外部类方法，用于创建和返回内部实现类的实例
    public InnerInterface getInnerClassInstance() {
        return new InnerClass();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        InnerInterface inner = outer.getInnerClassInstance();
        inner.doSomething(); // 输出: Doing something in InnerClass.
    }
}

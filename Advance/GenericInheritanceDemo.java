package Advance;

// 泛型父类
class GenericParent<T> {
    private T value;

    public GenericParent(T value) {
        this.value = value;
    }

    // 泛型方法
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    // 非泛型方法
    public void printMessage() {
        System.out.println("Generic Parent");
    }
}

// 子类继承泛型父类，并使用父类的类型参数
class GenericChild<T> extends GenericParent<T> {
    public GenericChild(T value) {
        super(value);
    }

    // 覆盖父类的非泛型方法
    @Override
    public void printMessage() {
        System.out.println("Generic Child");
    }
}

// 子类继承泛型父类，并定义自己的类型参数
class GenericChildWithOwnType<T, U> extends GenericParent<T> {
    private U anotherValue;

    public GenericChildWithOwnType(T value, U anotherValue) {
        super(value);
        this.anotherValue = anotherValue;
    }

    // 泛型方法，使用自己的类型参数
    public U getAnotherValue() {
        return anotherValue;
    }

    public void setAnotherValue(U anotherValue) {
        this.anotherValue = anotherValue;
    }
}

// 演示类
public class GenericInheritanceDemo {
    public static void main(String[] args) {
        // 使用泛型父类
        GenericParent<String> parent = new GenericParent<>("Parent Value");
        System.out.println("Parent Value: " + parent.getValue());
        parent.printMessage();

        // 使用继承泛型父类的子类
        GenericChild<Integer> child = new GenericChild<>(123);
        System.out.println("Child Value: " + child.getValue());
        child.printMessage();

        // 使用继承泛型父类并定义自己类型参数的子类
        GenericChildWithOwnType<Double, Boolean> childWithOwnType = new GenericChildWithOwnType<>(3.14, true);
        System.out.println("ChildWithOwnType Value: " + childWithOwnType.getValue());
        System.out.println("Another Value: " + childWithOwnType.getAnotherValue());
    }
}
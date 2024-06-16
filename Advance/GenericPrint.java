package Advance;

import java.util.List;

public class GenericPrint {

    // 使用泛型通配符<?>的方法，接受任意类型的List
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // 创建不同类型的List
        List<String> stringList = List.of("Apple", "Banana", "Cherry");
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.0, 2.0, 3.5, 4.2);

        // 调用printList方法，打印不同类型List的内容
        printList(stringList);
        printList(integerList);
        printList(doubleList);
    }
}

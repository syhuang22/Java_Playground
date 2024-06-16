package Advance;

public class GenericSwap {

    // 泛型方法，用于交换数组中两个元素的位置
    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Indices are out of bounds or array is null");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // 整数数组示例
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swap:");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 交换索引为1和3的元素
        swap(intArray, 1, 2);

        System.out.println("After swap:");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 字符串数组示例
        String[] stringArray = {"a", "b", "c", "d", "e"};
        System.out.println("Before swap:");
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 交换索引为0和4的元素
        swap(stringArray, 0, 4);

        System.out.println("After swap:");
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
    }
}

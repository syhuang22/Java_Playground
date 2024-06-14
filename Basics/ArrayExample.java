package Basics;

import java.util.Arrays;

    public class ArrayExample {
        public static void main(String[] args) {
            int[] array = {5, 3, 2, 1, 4};
            Arrays.sort(array);
            System.out.println(Arrays.toString(array)); // 输出: [1, 2, 3, 4, 5]
        }
}

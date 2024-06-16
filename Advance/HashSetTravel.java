package Advance;

import java.util.HashSet;  // disordered 
import java.util.LinkedHashSet; // ordered 


public class HashSetTravel {
    public static void main(String[] args) {
        // 创建一个HashSet并添加一些元素
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");
        hashSet.add("date");

        // 使用foreach循环遍历HashSet
        for (String element : hashSet) {
            // 打印出HashSet中的每个元素
            System.out.println(element);
        }
    }
}

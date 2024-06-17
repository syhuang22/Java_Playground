package Advance;

import java.util.EnumSet;
import java.util.Set;

// 定义枚举类型Weekday
enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumSetExample {
    public static void main(String[] args) {
        // 使用EnumSet来创建Weekday的集合
        Set<Weekday> weekdays = EnumSet.noneOf(Weekday.class); // 创建一个空的EnumSet

        // 添加元素到集合中
        weekdays.add(Weekday.MONDAY);
        weekdays.add(Weekday.TUESDAY);
        weekdays.add(Weekday.WEDNESDAY);

        // 输出集合中的元素
        System.out.println("Weekdays in the set: " + weekdays);

        // 检查集合中是否包含某个元素
        boolean containsThursday = weekdays.contains(Weekday.THURSDAY);
        System.out.println("Does the set contain THURSDAY? " + containsThursday);

        // 从集合中移除元素
        weekdays.remove(Weekday.TUESDAY);
        System.out.println("Weekdays after removing TUESDAY: " + weekdays);

        // 使用EnumSet的静态方法创建具有特定元素的集合
        Set<Weekday> workdays = EnumSet.of(Weekday.MONDAY, Weekday.TUESDAY, Weekday.WEDNESDAY, Weekday.THURSDAY, Weekday.FRIDAY);
        System.out.println("Workdays: " + workdays);

        // 集合之间的操作，例如交集
        Set<Weekday> weekend = EnumSet.of(Weekday.SATURDAY, Weekday.SUNDAY);
        Set<Weekday> commonDays = EnumSet.copyOf(workdays);
        commonDays.retainAll(weekend); // 保留两个集合的交集
        System.out.println("Common days between workdays and weekend: " + commonDays);
    }
}
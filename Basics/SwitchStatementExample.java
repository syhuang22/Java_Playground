package Basics;

import java.util.Scanner;

public class SwitchStatementExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数字（1-3）: ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("你选择了1");
                break;
            case 2:
                System.out.println("你选择了2");
                break;
            case 3:
                System.out.println("你选择了3");
                break;
            default:
                System.out.println("无效的选择");
        }
        
        scanner.close();
    }
}

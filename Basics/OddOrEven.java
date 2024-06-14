package Basics;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter A Number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        scanner.close();
    }

}

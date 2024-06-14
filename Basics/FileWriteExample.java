package Basics;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteExample {
    public static void main(String[] args) {
        String filePath = "output.txt"; // 我们将要写入的文件
        BufferedWriter writer = null;
        Scanner scanner = new Scanner(System.in);

        try {
            writer = new BufferedWriter(new FileWriter(filePath));
            System.out.println("请输入内容，输入'end'结束：");
            String input;
            while (!(input = scanner.nextLine()).equals("end")) {
                writer.write(input);
                writer.newLine(); // 换行
                writer.flush(); // 刷新缓冲区，确保内容被写入文件
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close(); // 写入完毕后关闭文件
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (scanner != null) {
                scanner.close(); // 关闭Scanner对象
            }
        }
    }
}

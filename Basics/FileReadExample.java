package Basics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReadExample {
    public static void main(String[] args) {
        String filepath = "/home/azureuser/Java_Playground/Basics/example.txt";

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filepath));
            String line; 
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e ) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch(IOException e) {
                    //e.printStackTrace();
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

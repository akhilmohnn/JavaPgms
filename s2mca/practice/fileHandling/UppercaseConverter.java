import java.io.*;
import java.util.Scanner;

public class UppercaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        try (Writer writer = new FileWriter("original.txt")) {
            writer.write(sentence);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Reader reader = new FileReader("original.txt");
             Writer writer2 = new FileWriter("uppercase.txt",true)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer2.write(Character.toUpperCase((char) ch));
            }
            System.out.println("Uppercase data written to uppercase.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }

}

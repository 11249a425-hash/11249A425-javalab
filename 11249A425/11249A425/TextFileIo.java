
import java.io.*;

class TextFileIO {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("notes.txt");

            fw.write("Welcome to Java Programming!\n");
            fw.write("FileWriter and FileReader example.");
            fw.close();

            System.out.println("Content written successfully.");

            FileReader fr = new FileReader("notes.txt");
            int ch;

            System.out.println("\nFile Content:");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

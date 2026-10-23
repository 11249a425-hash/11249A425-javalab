
import java.io.*;

class ProfileIO {
    public static void main(String[] args) {
        try {
            FileOutputStream fout =
                new FileOutputStream("profile.txt");

            String profile = "Name: Arun\nAge: 20\nFitness Goal: Weight Loss";
            fout.write(profile.getBytes());
            fout.close();

            System.out.println("Profile written successfully.");

            FileInputStream fin =
                new FileInputStream("profile.txt");

            int ch;
            System.out.println("\nUser Profile:");

            while ((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }

            fin.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

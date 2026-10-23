import java.util.Scanner;

public class modulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (b != 0) {
            int remainder = a % b;
            System.out.println("Remainder = " + remainder);
        } else {
            System.out.println("Cannot find remainder when divisor is zero.");
        }
    }
}


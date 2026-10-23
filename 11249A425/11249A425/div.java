import java.util.Scanner;

public class div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        double a = sc.nextDouble();

        System.out.print("Enter divisor: ");
        double b = sc.nextDouble();

        if (b != 0) {
            double quotient = a / b;
            System.out.println("Division = " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

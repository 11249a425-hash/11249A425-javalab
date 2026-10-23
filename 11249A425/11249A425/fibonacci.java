import java.util.Scanner;

public class fibonacci {

    static int first = 0, second = 1, next;

    static void fibonacci(int n) {
        if (n > 0) {
            next = first + second;
            first = second;
            second = next;
            System.out.print(" " + next);
            fibonacci(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.print("Fibonacci Series: " + first + " " + second);

        fibonacci(n - 2);
    }
}


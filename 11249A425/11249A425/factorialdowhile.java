import java.util.Scanner;

public class factorialdowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = 1;
        int i = 1;

        if (n == 0) {
            fact = 1;
        } else {
            do {
                fact = fact * i;
                i++;
            } while (i <= n);
        }

        System.out.println("Factorial = " + fact);
    }
}


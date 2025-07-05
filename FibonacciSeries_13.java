import java.util.Scanner;

public class FibonacciSeries_13 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series of " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;
        }

        input.close();
    }
}

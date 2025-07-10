import java.util.Scanner;

public class DigitFrequencyCounter_18 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int[] freq = new int[10];

        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            freq[digit]++;
            temp = temp / 10;
        }

        System.out.println("Digit frequencies in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }

        input.close();
    }
}

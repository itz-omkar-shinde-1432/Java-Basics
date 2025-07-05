import java.util.Scanner;
public class SumOfDigits_15 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        int sum=0;
        while(num!=0){
            int rem= num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.print("The sum of the digits is "+sum);
        input.close();
    }
    
}

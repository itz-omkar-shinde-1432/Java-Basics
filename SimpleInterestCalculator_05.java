import java.util.Scanner;
public class SimpleInterestCalculator_05 {
    public static void main (String args[]){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter the principle amount:");
     double principle = input.nextDouble();

     System.out.print("Enter the Rate amount:");
     double rate= input.nextDouble();

     System.out.print("Enter the time:");
     double time = input.nextDouble();

     double interest =( principle*rate*time)/100 ;
     System.out.println("The simple interest of the given values is "+ interest);

     input.close();
    }
}

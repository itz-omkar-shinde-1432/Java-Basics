import java.util.Scanner ;  
public class SumTwoNumbers_04 {
    public static void main (String args[]){
      Scanner input = new Scanner (System.in);

      System.out.println("enter the first number:");
      int num1 = input.nextInt();
       
      System.out.println("enter the second number:");
      int num2 = input.nextInt();
       

      System.out.println("The addition of two numbers is: "+(num1+num2));
     input.close();

    }
}

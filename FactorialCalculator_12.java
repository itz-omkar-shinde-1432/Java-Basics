import java.math.BigInteger;
import java.util.Scanner;
public class FactorialCalculator_12 {
public static void main (String args[]){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number:");
    int num= input.nextInt();
    BigInteger factorial = BigInteger.ONE; 
    
    if(num==0){
        System.out.println("The Factorial of "+num+" is 1");
    }else{
        for(int i=1;i<=num;i++){
             factorial = factorial.multiply(BigInteger.valueOf(i));
            
        } System.out.println("The factorial of "+num+" is " +factorial);
    }
    
    input.close();
   }    
}
import java.util.Scanner;
public class PrimeCheck_10 {
    public static void main(String args[]) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number:");
    double num = input.nextDouble();

    boolean Prime = true;
    

    if (num<=1){ 
    Prime = false; 
    }
    else {
        for (int i=2;i<=num/2;i++){
            if (num%i==0){
                Prime = false;
                break;   
            }
        }
    } 
    

    if(Prime){
        System.out.println(num+" is prime");
    } else{
        System.out.println(num+" is not prime");
    }









        input.close();

    }
    
    
}

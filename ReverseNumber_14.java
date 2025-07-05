import java.util.Scanner;
public class ReverseNumber_14 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
    
     System.out.println("Enter the number");
     int num= input.nextInt();
     int originalnum=num;

     int rev=0;

     while(num!=0){
        int rem= num%10;
        rev= rev *10+rem;
        num=num/10;
     }
    System.out.println("The reverse of "+originalnum+" is "+rev);
   
        input.close();
    }
}

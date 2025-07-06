import java.util.Scanner;
public class ArmstrongCheck_16 {
    public static void main(String args[]){
    Scanner input = new Scanner (System.in);
      
      System.out.println("Enter three numbers:");
      int num=input.nextInt();
      
      int count=0;
      int temp=num;
      while(temp!=0){
        temp=temp/10;
        count++;
      }
      System.out.println("The count of number is:"+count);


      int sum=0;
      temp=num;

      while(temp!=0){
        int digit= temp%10;
         sum += Math.pow(digit,count);
         temp=temp/10;
      }
           

        if (sum==num){
          System.out.println("The given number is Armstrong");
        }else{
          System.out.println("The given number is not Armstrong");
        }

      




     input.close();
        
    }
}

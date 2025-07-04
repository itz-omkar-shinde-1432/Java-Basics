import java.util.Scanner;
public class PalindromeCheck_11 {
   public static void main(String args[]){

  Scanner input = new Scanner(System.in);

  System.out.println("Enter one integer:");
  int num = input.nextInt();

  int originalnum=num;

  int reversed =0;
  while(num !=0){
    int digit = num %10;
    reversed = reversed*10+digit;
    num=num/10;
  }

  if (reversed==originalnum){
    System.out.println(originalnum+" is palindrome ");

  }else {
    System.out.println(originalnum+" is not palindrome");
  }












    input.close();
   }
    
}

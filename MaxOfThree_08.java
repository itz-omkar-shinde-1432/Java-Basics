import java.util.Scanner;
public class MaxOfThree_08 {
public static void main (String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("enter three numbers one by one:");

    int num1= input.nextInt();
    int num2 = input.nextInt();
    int num3= input.nextInt();

    if(num1>=num2 && num1>=num3){ 
        System.out.println(num1+"  is the greatest among all.");
    }else if (num2>=num1&& num2>=num3){ 
        System.out.println(num2+"  is the greatest among all.");
    }else{ 
        System.out.println(num3+" is the greatest among all.");
    }













   input.close();
}
    
}

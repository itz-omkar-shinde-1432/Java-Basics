import java.util.Scanner;
public class EvenOddCheck_07 {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    System.out.print("enter the number:");
    int num= input.nextInt();

    if (num%2==0){ 
    System.out.println(num +" is even");}
    else{ 
    System.out.println(num+" is odd");}

    input.close();


    } 
}

import java.util.Scanner;
public class MultiplicationTable_19 {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table: ");
        int num= input.nextInt();
         for(int i=1;i<11;i++){
            System.out.println(num +"x"+ i+"="+(num*i));
         }
         input.close();
        }
       
    }  
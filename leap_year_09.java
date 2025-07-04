import java.util.Scanner;
public class leap_year_09 {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the year for checking whether it is leap or not :");
    int year = input.nextInt();

    if (year%4==0){
        System.out.println(year+" is leap year........!");
     }
    else{
        System.out.println(year+" is not leap year........!");
    }


























        input.close();
    }
}

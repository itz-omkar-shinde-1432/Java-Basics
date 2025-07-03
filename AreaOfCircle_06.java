import java.util.Scanner;
public class AreaOfCircle_06 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

       System.out.print("enter the radius of the circle:");
       double radius =  input.nextDouble();

       double area = Math.PI*radius*radius;
       System.out.print("area of circle is:"+area);

      input.close();
    }
    
}

import java.util.Scanner ;
public class UserDetails_03 {
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter Your Name:");
        String name= input.nextLine();

        System.out.println("Enter Your age:");
        int age= input.nextInt();
         
        System.out.println("Hello "+name+"! You are "+age+" Years Old.");

        input.close();


    }
    
}

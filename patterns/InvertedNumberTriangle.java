package patterns;
import java.util.Scanner;
public class InvertedNumberTriangle {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}

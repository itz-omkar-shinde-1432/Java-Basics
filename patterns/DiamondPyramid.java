package patterns;

import java.util.Scanner;
public class DiamondPyramid {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows for the diamond pyramid: ");
        int n=input.nextInt();

        for(int i=0;i<n;i++){

            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }   
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}

import java.util.Scanner;
public class VowelCounter_20 {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a String:");    
        String str = input.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    input.close();
}
 }
    


import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = scanner.nextLine();
        
        int sLength = s.length();
       


        
        for(int i = 1; i <= sLength; i++){
            System.out.print(s);
        }
    
    }
}

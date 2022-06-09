import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number that you want to add: ");
        int num = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= num; i++){
            System.out.print("Enter an integer: ");
            int num1 = scanner.nextInt();
            sum = sum+num1;
        }

        System.out.print(sum);
        
        
    
    }
}

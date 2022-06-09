import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input a first number: ");
        int first = scanner.nextInt();

        System.out.print("input a end number: ");
        int end = scanner.nextInt();

        for(int i = first; i <= end; i++){
            System.out.print(i);
        }



    }
}

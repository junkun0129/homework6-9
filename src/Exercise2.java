import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input the N: ");
        int n = scanner.nextInt();
        System.out.printf("The sum of 1 to %d is %d", n, multi(n));
        
        
    }


    public static int multi(int num){
        if(num <= 1)
            return num;

        return num + multi(num - 1);
    }
}



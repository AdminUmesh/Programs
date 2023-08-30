// Check odd even number
import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a value");
        int Num = sc.nextInt();
        sc.close();

        if (Num % 2 == 0) {
            System.out.println("You have Intered a even Number");
        } else {
            System.out.println("You have Intered a Odd Number");
        }
    }
}
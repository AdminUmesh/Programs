// Check a number is Leap or Not
import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a value");
        int Num = sc.nextInt();
        sc.close();

        if (Num % 4 == 0) {
            if (Num % 100 == 0) {
                if (Num % 400 == 0) {
                    System.out.println("leap year");
                } else {
                    System.out.println("not a leap year");
                }
                
            } else {
                System.out.println("leaap year");
            }

        } else {
            System.out.println("not a leap year");
        }
    }
}
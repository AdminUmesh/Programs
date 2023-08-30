// Find Factorial of Number using recursion

import java.util.Scanner;

public class FactorialUsingRecursion {
    static int CheckFactorial(int Num) {
        int fact = 1;
        if (Num == 0) {
            return fact;
        }

        for (int i = 1; i <= Num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Plzz Enter Number");
        int Num = sc.nextInt();
        sc.close();

        System.out.println(CheckFactorial(Num));
    }
}

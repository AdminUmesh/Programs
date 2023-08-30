//Find Gretest Common Division of Two Number

import java.util.Scanner;

public class GreatestCommonDevision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Plzz enter first number:-");
        int Num1 = sc.nextInt();

        System.out.println("Plzz enter Second number:-");
        int Num2 = sc.nextInt();
        sc.close();

        System.out.println(GCD(Num1, Num2));
    }

    static int GCD(int Num1, int Num2) {
        if (Num2 == 0)
            return Num1;
        return GCD(Num2, Num1 % Num2);
    }
}

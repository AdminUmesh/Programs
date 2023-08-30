// Print Fibbonaci Series Without Recursion
import java.util.Scanner;

public class without_recursion {
    static void recursion(int Number) {
        int Num1 = 0, Num2 = 1, Num3 = 0, count = Number;

        System.out.print(Num1 + " " + Num2 + " ");

        for (int i = 0; i < count - 2; i++) {
            Num3 = Num1 + Num2;
            System.out.print(Num3 + " ");

            Num1 = Num2;
            Num2 = Num3;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Plzz enter a number");
        int Number = sc.nextInt();
        sc.close();

        recursion(Number);
    }
}

import java.util.Scanner;

public class with_recursion {
    static void recursion(int Num1, int Num2, int Num3, int Number) {
        if (Number > 2) {
            Num3 = Num1 + Num2;
            Num1 = Num2;
            Num2 = Num3;
            System.out.print(Num3 + " ");
            recursion(Num1, Num2, Num3, Number - 1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Plzz enter a Number");
        int Number = sc.nextInt();
        sc.close();

        int Num1 = 0, Num2 = 1, Num3 = 0;
        System.out.print(Num1 + " " + Num2 + " ");
        recursion(Num1, Num2, Num3, Number);
    }
}

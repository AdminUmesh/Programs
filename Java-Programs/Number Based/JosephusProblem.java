//Josephus Problem

import java.util.Scanner;

public class JosephusProblem {
    public static int Count(int n, int k) {
        if (n == 1)
            return 0;
        return (Count(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Plzz enter base number:-");
        int Num1 = sc.nextInt();

        System.out.println("Plzz enter Power number:-");
        int Num2 = sc.nextInt();
        sc.close();

        System.out.println(Count(Num1, Num2));
    }
}

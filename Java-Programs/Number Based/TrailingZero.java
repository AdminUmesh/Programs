//Trailing Zero in Factorial 

import java.util.Scanner;

public class TrailingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Plzz enter a number");
        int Num = sc.nextInt();
        sc.close();

        Trailingzero(Num);
    }

    public static void Trailingzero(int Num) {
        int res = 0;

        for (int i= 5; i <= Num; i= i*5) {
            res = res + Num/i;
        }

        System.out.println(res);
    }
}

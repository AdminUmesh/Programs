//Find The Power Of any two number

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Plzz enter base number:-");
        int Num1 = sc.nextInt();

        System.out.println("Plzz enter Power number:-");
        int Num2 = sc.nextInt();
        sc.close();

        System.out.println(CalculatePower(Num1, Num2));
    }

    static int CalculatePower(int Base, int Power) {
        int Res = 1;

        while (Power > 0) {
            if ((Power & 1) != 0) {
                Res = Res * Base;
            }

            Base = Base * Base;
            Power = Power >> 1;
        }
        return Res;
    }
}

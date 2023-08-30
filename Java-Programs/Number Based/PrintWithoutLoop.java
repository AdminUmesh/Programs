//print the number form 1 to n without any loop

import java.util.Scanner;

public class PrintWithoutLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Plzz enter a number:-");
        int Num = sc.nextInt();
        sc.close();

        PrintNumber(Num);
    }

    public static void PrintNumber(int Number) {
        if (Number <= Number && Number >= 1) {
            System.out.println(Number);
            PrintNumber(Number - 1);
        }
    }
}

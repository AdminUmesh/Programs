//Swap two number using bitwise perator

import java.util.Scanner;

public class SwapBitwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Plzz enter first number");
		int Num1 = sc.nextInt();

		System.out.println("Plzz enter second number");
		int Num2 = sc.nextInt();
		sc.close();

		Swap(Num1, Num2);
	}

	public static void Swap(int Num1, int Num2) {
		System.out.println("Before swap " + Num1 + " " + Num2);

		Num1 = Num1 ^ Num2;
		Num2 = Num1 ^ Num2;
		Num1 = Num1 ^ Num2;

		System.out.println("Before swap " + Num1 + " " + Num2);
	}
}

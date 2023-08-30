//Factorial Trailing Zeroes.

import java.util.Scanner;

public class factorialTrailing {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);

		System.out.println("Plzz enter the number:-");
		int Num = Sc.nextInt();
		Sc.close();

		int Fact = 1;
		if (Num == 0 && Num == 1) {
			Fact = 1;
		}

		for (int i = 2; i <= Num; i++) {
			Fact = Fact * i;
		}

		int count = 0;
		while (Fact % 10 == 0) {
			count = count + 1;
			Fact = Fact / 10;
		}

		System.out.print("Factorial Trailing Zeroes in Java:- " + count);
	}
}

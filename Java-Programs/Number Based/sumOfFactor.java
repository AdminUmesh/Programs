//Sum of all the factors of a number

import java.util.Scanner;

public class sumOfFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Plzz enter a number:-");
		int Num = sc.nextInt();
		sc.close();

		SumOfFactor(Num);
	}

	public static void SumOfFactor(int Num) {
		int Sum = 0;

		for (int i = 1; i <= Num; i++) {
			if (Num % i == 0) {
				Sum += i;
			}
		}

		System.out.print("Sum of all the factors of a number:- " + Sum);
	}
}

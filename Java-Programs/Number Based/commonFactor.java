//Find The Gretest Common Factor of Two Number And Lowest Common Of Two Number:

import java.util.Scanner;

public class commonFactor {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter The Frist number:-");
		int N1 = Sc.nextInt();

		System.out.println("Enter The Second number:-");
		int N2 = Sc.nextInt();
		Sc.close();

		int Num1 = N1;
		int Num2 = N2;

		while (N1 % N2 != 0) {
			int rem = N1 % N2;
			N1 = N2;
			N2 = rem;
		}

		int GCD = N2;
		int LCM = (Num1 *Num2) / GCD;

		System.out.print("Gretest Common Factor of Two Number:-" + GCD + "\n");
		System.out.print("Lowest Common Factor of Two Number:-" + LCM);

	}
}

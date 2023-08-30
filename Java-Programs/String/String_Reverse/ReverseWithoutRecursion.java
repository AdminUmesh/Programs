// Reverse String Without Recursion

import java.util.Scanner;

public class ReverseWithoutRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Plzz enter string to reverse");
		String Str = sc.nextLine();
		sc.close();

		ReverseString(Str);
	}

	public static void ReverseString(String str) {
		String StrReverse = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			StrReverse += str.charAt(i);
		}
		System.out.println(StrReverse);
	}
}
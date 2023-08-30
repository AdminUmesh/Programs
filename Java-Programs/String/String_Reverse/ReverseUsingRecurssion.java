// String Reverse Using Recursion

import java.util.Scanner;

public class ReverseUsingRecurssion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("plzz enter string to reverse");
		String Str = sc.nextLine();
		sc.close();

		System.out.println(ReverseString(Str));
	}

	public static String ReverseString(String Str) {
		String StrReverse = "";
		for (int i = Str.length() - 1; i >= 0; i--) {
			StrReverse += Str.charAt(i);
		}
		return StrReverse;
	}
}
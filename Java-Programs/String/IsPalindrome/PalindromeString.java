// Check String is Palindrome or not

import java.util.Scanner;

class PalindromeString {
	public static void isPalindrome(String Str) {
		String rev = "";

		boolean ans = false;

		for (int i = Str.length() - 1; i >= 0; i--) {
			rev = rev + Str.charAt(i);
		}

		// Checking if both the strings are equal
		if (Str.equals(rev)) {
			ans = true;
		}

		if (ans == true) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not a Palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter a String");
		String Str = sc.nextLine();
		sc.close();

		isPalindrome(Str);
	}
}

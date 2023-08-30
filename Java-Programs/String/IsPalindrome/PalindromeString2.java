// Check String is Palindrome or not

import java.util.Scanner;

class PalindromeString2 {
	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void Output(boolean Return) {
		if (Return == true) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not pelindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter a String");
		String Str = sc.nextLine();
		sc.close();

		boolean returnVal = isPalindrome(Str);
		Output(returnVal);
	}
}

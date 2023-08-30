// Program to remove all white spaces from a string with using replace().

import java.util.Scanner;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Plzz enter string");
		String Str = sc.nextLine();
		sc.close();
		ReverseString(Str);
	}

	public static void ReverseString(String Str) {
		String Str2 = Str.replaceAll("\\s", "");
		System.out.println(Str2);
	}
}

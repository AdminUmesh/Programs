// Compare the two String without any inbuilt function CAse sensetive

import java.util.Scanner;

public class compareInbuilt {
    public boolean find(String Str1, String Str2) {
        if (Str1 == null || Str2 == null || Str1.length() != Str2.length()){
            return false;
        }
        
        for (int i = 0; i < Str1.length(); i++) {
            if (Str1.charAt(i) != Str2.charAt(i)){
                return false;
            }
        }
        
       return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		System.out.println("Plzz enter string");
		String Str1 = sc.nextLine();

        System.out.println("Plzz enter string");
		String Str2 = sc.nextLine();
		sc.close();

        compareInbuilt Compare = new compareInbuilt();

        System.out.println(Compare.find(Str1, Str2));
    }
}

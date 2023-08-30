// check a number is Pelindrome or Not

import java.util.Scanner;

class PalindromeNumber {
    static int Dublicate=0;
	public static void isPalindrome(int Num)
	{
        int OriginalNum=Num;
		while(OriginalNum!=0){
            int rem=OriginalNum%10;
            Dublicate=(Dublicate*10)+rem;
            OriginalNum=OriginalNum/10;
        }

		if(Dublicate == Num){
			System.out.println("Palindrome Number");
		}else{
			System.out.println("Not a Palindrome Number");
		}
	}
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);

		System.out.println("Please Enter a Number");
		int Num = Sc.nextInt();
		Sc.close();

		isPalindrome(Num);
	}
}

import java.util.Scanner;

public class armstrong {
	static boolean CheckArmstrong(int Num) {
		int Digit = 0, Last = 0, Sum = 0;
		int temp = Num;
		while (temp > 0) {
			temp = temp / 10;
			Digit++;
		}
		temp = Num;
		
		while (temp > 0) {
			Last = temp % 10;
			Sum += (Math.pow(Last, Digit));
			temp /= 10;
		}

		if (Num == Sum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Plzz enter a number");
		int Num = sc.nextInt();
		sc.close();

		if (CheckArmstrong(Num)) {
			System.out.println(Num + " is a Amstrong Number");
		} else {
			System.out.println(Num + " is not a Amstrong Number");
		}

	}
}
//Check prime number using of seive Of EratoSthenes.
//The sieve of Eratosthenes is one of the most efficient ways to find all primes smaller than n when n is smaller than 10 million

import java.util.Scanner;
import java.util.Arrays;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a number to check");
        int Num = Sc.nextInt();
        Sc.close();

        boolean isPrime[] = Search(Num);

        for (int i = 0; i <= Num; i++) {
            if(isPrime[i])
            System.out.println(i + " " + "Prime");
            System.out.println(i + " " + "Not Prime");
        }

    }

    static boolean[] Search(int Num) {
        boolean isPrime[] = new boolean[Num + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= Num; i++) {
            for (int j = 2 * i; j <= Num; j += i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}

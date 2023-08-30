//Fibbonaci Series Using Memoization 

import java.util.Scanner;

public class febbinacy {
    public static int FibMemoized(int Num, int[] Arr) {
        if (Num == 0 || Num == 1) {
            return Num;
        }

        if (Arr[Num] != 0) {
            return Arr[Num];
        }
        
        int fibn1 = FibMemoized(Num - 1, Arr);
        int fibn2 = FibMemoized(Num - 2, Arr);
        int fibn = fibn1 + fibn2;
        Arr[Num] = fibn;
        
        return fibn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Plzz enter number:-");
        int Num = sc.nextInt();
        sc.close();

        int Arr[] = new int[Num + 1];
        System.out.println(FibMemoized(Num, Arr));
    }
}

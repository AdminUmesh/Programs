/*Find the number of ways of given matrix N*M
             or
Count all possible paths from top left to bottom right of a mXn matrix

Input:  M = 2, N = 2
Output: 2
Explanation: There are two paths
(0, 0) -> (0, 1) -> (1, 1)
(0, 0) -> (1, 0) -> (1, 1)

Input:  M = 2, N = 3
Output: 3
Explanation: There are three paths
(0, 0) -> (0, 1) -> (0, 2) -> (1, 2)
(0, 0) -> (0, 1) -> (1, 1) -> (1, 2)
(0, 0) -> (1, 0) -> (1, 1) -> (1, 2)*/

import java.util.Scanner;

public class matrix {
    public static int count(int Rows, int Columns) {
        if (Rows == 1 || Columns == 1)
            return 1;
        return count(Rows - 1, Columns) + count(Rows, Columns - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Number Of Rows");
        int Rows = sc.nextInt();

        System.out.println("Please Enter Number Of Columns");
        int Columns = sc.nextInt();

        sc.close();

        System.out.println(count(Rows, Columns));
    }
}

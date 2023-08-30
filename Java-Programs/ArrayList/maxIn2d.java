//Print max value from the 2d List Diagonal

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maxIn2d {
	static void printPrincipalDiagonal(List<List<Integer>> arr) {
		int size = arr.get(0).size();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			al.add(arr.get(i).get(i));
			al.add(arr.get(i).get(size - i - 1));
		}
		ArrayList<Integer> al1 = new ArrayList();
		for (int i = 0; i < al.size(); i++) {
			if (isPrime(al.get(i))) {
				al1.add(al.get(i));
			}
		}
		System.out.print(al1 + " ");
		System.out.println(Collections.max(al1));

	}

	static boolean isPrime(int num) {
		boolean isPrime = false;
		int i = (int) Math.ceil(Math.sqrt(num));
		while (i > 1) {
			if ((num != i) && (num % i == 0)) {
				isPrime = false;
				break;
			} else if (!isPrime)
				isPrime = true;
			--i;
		}
		return isPrime;
	}

	// Driver code
	public static void main(String args[]) {
		List<List<Integer>> arr = new ArrayList();
		ArrayList<Integer> arr1 = new ArrayList();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		ArrayList<Integer> arr2 = new ArrayList();
		arr2.add(5);
		arr2.add(6);
		arr2.add(7);
		arr2.add(8);
		ArrayList<Integer> arr3 = new ArrayList();
		arr3.add(1);
		arr3.add(2);
		arr3.add(3);
		arr3.add(4);
		ArrayList<Integer> arr4 = new ArrayList();
		arr4.add(5);
		arr4.add(6);
		arr4.add(7);
		arr4.add(8);
		arr.add(arr1);
		arr.add(arr2);
		arr.add(arr3);
		arr.add(arr4);
		printPrincipalDiagonal(arr);
	}
}

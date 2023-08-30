//Find Second Largest Number in Array Without Sorting

public class SecondLargest {
	public static void main(String[] args) {
		int arr[] = { 12, 43, 13, 54, 11 };
		int max = arr[0];
		int sec_max = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				sec_max = max;
				max = arr[i];
			} else if (arr[i] > sec_max && arr[i] != max) {
				sec_max = arr[i];
			}
		}
		System.out.println("Second Largest Element Without Sorting:- " + sec_max);
	}
}

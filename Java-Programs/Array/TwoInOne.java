//Two sorted array store in one array(in sorted array From).

public class TwoInOne {
	public static void main(String[] args) {
		int a[] = { 11, 34, 66, 75 };
		int b[] = { 1, 5, 19, 50, 89, 100 };
		int c = a.length;
		int d = b.length;
		int fi[] = new int[c + d];
		int i = 0, j = 0, k = 0, x;
		while (i < c && j < d) {
			if (a[i] < b[j])
				fi[k++] = a[i++];
			else
				fi[k++] = b[j++];
		}
		while (i < c) {
			fi[k++] = a[i++];
		}
		while (j < d) {
			fi[k++] = b[j++];
		}
		for (x = 0; x < (c + d); x++) {
			System.out.print(fi[x] + " ");
		}
	}
}

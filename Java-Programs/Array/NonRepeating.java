//Find the only non-repeating element in array where every element repeats twice.

public class NonRepeating {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 4, 3, 5, 1 };
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}

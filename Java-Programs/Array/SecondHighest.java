//Write a Java Program to find the second-highest number in an array.

public class SecondHighest {
    public static void main(String[] args) {
        int arr[] = { 12, 43, 23, 11, 54, 16 };
        int sl = 0;
        int l = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > l) {
                sl = l;
                l = arr[i];
            } else if (arr[i] > sl) {
                sl = arr[i];
            }
        }
        System.out.println("Second height number in array are: " + sl);
        System.out.println("largest number in the array are: " + l);
    }
}

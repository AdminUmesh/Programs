//Write a Java Program to find the second-highest number in an array.

public class SecondHighest {
    public static void main(String[] args) {
        int arr[] = { 12, 43, 23, 11, 54, 16 };
        int SecondMax = 0;
        int Max = 0;
        int Len = arr.length;
        for (int i = 0; i < Len; i++) {
            if (arr[i] > Max) {
                SecondMax = Max;
                Max = arr[i];
            } else if (arr[i] > SecondMax) {
                SecondMax = arr[i];
            }
        }
        System.out.println("Second height number in array are: " + SecondMax);
        System.out.println("largest number in the array are: " + Max);
    }
}

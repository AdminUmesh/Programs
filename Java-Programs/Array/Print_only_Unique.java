// Print only unique value from Array

import java.util.HashSet;
public class Print_only_Unique {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 3, 6, 7, 7};

        // Create a HashSet to store unique elements
        HashSet<Integer> uniqueSet = new HashSet<>();

        // Iterate through the original array and add elements to the HashSet
        for (int element : array) {
            uniqueSet.add(element);
        }

        // Print the unique elements from the HashSet
        System.out.println("Unique elements in the array are:");
        for (int uniqueElement : uniqueSet) {
            System.out.println(uniqueElement);
        }
    }
}

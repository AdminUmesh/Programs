// Print only Non-Repeating Element from Array

import java.util.HashMap;
import java.util.Map;

public class Non_Repeating2 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 2, 4, 5, 3, 6, 7, 7};

        // Create a HashMap to store the count of each element
        Map<Integer, Integer> elementCount = new HashMap<>();
        
        for(int i=0; i<array.length; i++){
            int count=0;
            for(int j=0; j<array.length; j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
                elementCount.put(array[i], count);
        }

        // Print the non-repeating (unique) values
        System.out.println("Non-repeating (unique) elements in the array are:");
        for (int element : array) {
            if (elementCount.get(element) == 1) {
                System.out.println(element);
            }
        }
    }
}

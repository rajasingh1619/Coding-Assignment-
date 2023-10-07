import java.util.*;
public class ShuffleArray {
    public static void main(String[] args) {
    // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // To Calculate Length of an Array arr.
         int n = arr.length;
         //we use the Random class to generate a random index number.
        Random ans= new Random();
        //We can iterate through the array elements in a for loop.
         for (int i = n - 1; i > 0; i--) {
            int j = ans.nextInt(i + 1);
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Print the shuffled array
        System.out.println(Arrays.toString(arr));
    }
}

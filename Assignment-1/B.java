import java.util.*;
public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();// Take an input as a String .
         if (s == null || s.length() == 0){
        System.out.println("Roman numeral " + s + " is equivalent to integer -1"  );
        return ;
         }
        // Create a mapping of Roman numerals to their integer values
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = map.get(currentChar);

            // If the current value is smaller than the previous value, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                // Otherwise, add its value to the result
                result += currentValue;
            }

            // Update the previous value for the next iteration
            prevValue = currentValue;
        }

        // Print the resulting integer
         System.out.println("Roman numeral " + s + " is equivalent to integer " + result);
    }
}

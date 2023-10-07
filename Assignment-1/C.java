import java.util.*;
public class PangramChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        // Create an array to mark the presence of each letter from 'a' to 'z'
        boolean[] ans= new boolean[26];
        
        // Convert the input string to lowercase to ensure case insensitivity
        str = str.toLowerCase();
        
        // Iterate through the characters in the input string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // Check if the character is a lowercase letter
            if ('a' <= c && c <= 'z') {
                // Mark the corresponding letter as present
                ans[c - 'a'] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are present
        for (boolean p : ans) {
            if (!p) {
                // If any letter is missing, return false
                return false;
            }
        }
        
        // If all letters are present, return true
        return true;
    }
}

import java.util.Stack;
public class UseCase1PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        // USE CASE 2 (Hardcoded string + charAt two-pointer)
        String input = "madam";
        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare characters from both ends
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        // USE CASE 3 (Reverse string and compare)
        String input3 = "madam";
        StringBuilder reversedBuilder = new StringBuilder();

        for (int i = input3.length() - 1; i >= 0; i--) {
            reversedBuilder.append(input3.charAt(i));
        }

        String reversed = reversedBuilder.toString();

        if (input3.equals(reversed)) {
            System.out.println(input3 + " is a palindrome");
        } else {
            System.out.println(input3 + " is not a palindrome");
        }

        // USE CASE 4 (Two-pointer using char array)
        String input4 = "radar";
        char[] chars = input4.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome4 = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome4 = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome4) {
            System.out.println(input4 + " is a palindrome.");
        } else {
            System.out.println(input4 + " is not a palindrome.");
        }
    }
}

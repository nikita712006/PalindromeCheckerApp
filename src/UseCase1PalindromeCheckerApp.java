import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
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
        // USE CASE 5 (Using Stack only)
        String input5 = "noon";
        Stack<Character> stack5 = new Stack<>();

        for (char c : input5.toCharArray()) {
            stack5.push(c);
        }

        boolean isPalindrome5 = true;

        for (char c : input5.toCharArray()) {
            if (c != stack5.pop()) {
                isPalindrome5 = false;
                break;
            }
        }

        if (isPalindrome5) {
            System.out.println(input5 + " is a palindrome.");
        } else {
            System.out.println(input5 + " is not a palindrome.");
        }
        // USE CASE 6 (Using Queue + Stack)
        String input6 = "civic";
        Queue<Character> queue6 = new LinkedList<>();
        Stack<Character> stack6 = new Stack<>();

        for (char c : input6.toCharArray()) {
            queue6.add(c);
            stack6.push(c);
        }

        boolean isPalindrome6 = true;

        while (!queue6.isEmpty()) {
            if (!queue6.remove().equals(stack6.pop())) {
                isPalindrome6 = false;
                break;
            }
        }

        if (isPalindrome6) {
            System.out.println(input6 + " is a palindrome.");
        } else {
            System.out.println(input6 + " is not a palindrome.");
        }
    }
}
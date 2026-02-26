public class UseCase1PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

    }
    // Hardcoded string
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
    //USE CASE 3
    String input = "madam";
    String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
        reversed += input.charAt(i);
    }

        if (input.equals(reversed)) {
        System.out.println(input + " is a palindrome");
    } else {
        System.out.println(input + " is not a palindrome");
}

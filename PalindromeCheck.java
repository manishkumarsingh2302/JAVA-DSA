public class PalindromeCheck {

    // Recursive function to check if a string is palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: if start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // If characters at start and end don't match, it's not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive case: check the remaining substring
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "madam";

        // Remove spaces and convert to lowercase (optional for clean check)
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Call recursive function
        boolean result = isPalindrome(input, 0, input.length() - 1);

        // Output
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }
}

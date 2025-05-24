package week10.LA3;

public class PalindromeChecker {
    public String isPalindrome(String str) {
        if (str == null) {
            return "Is not a palindrome.";
        }

        if (validate(str)) {
            return "Is a palindrome.";
        } else {
            return "Is not a palindrome.";
        }
    }

    public boolean validate(String str) {
        // return if str is palindrome or not
        if (str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}

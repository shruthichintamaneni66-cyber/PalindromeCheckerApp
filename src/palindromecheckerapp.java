import java.util.*;

interface palindromeStrategy {
    boolean isPalindrome(String word);
}

class SimpleStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String word) {
        String rev = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(rev);
    }
}

class RecursiveStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String word) {
        return check(word, 0, word.length() - 1);
    }

    private boolean check(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return check(str, start + 1, end - 1);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        PalindromeStrategy strategy = new SimpleStrategy(); // switch strategy here

        if (strategy.isPalindrome(word)) {
            System.out.println("Palindrome (Strategy Pattern)");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
import java.util.*;

public class PalindromeCheckerApp {

    public static boolean method1(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }

    public static boolean method2(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        long start1 = System.nanoTime();
        method1(word);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        method2(word);
        long end2 = System.nanoTime();

        System.out.println("Method1 Time: " + (end1 - start1));
        System.out.println("Method2 Time: " + (end2 - start2));
    }
} void main(String[] args) {
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
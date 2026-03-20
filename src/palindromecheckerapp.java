import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        for (char c : word.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome (LinkedList Method)");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
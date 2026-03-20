import java.util.*;

public class palindromecheckerapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Character> deque = new LinkedList<>();

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome (Deque Method)");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
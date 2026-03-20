import java.util.Scanner;
import java.util.Stack;

import java.util.*;

public class palindromecheckerapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        for (char c : word.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        boolean isPalindrome = true;

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome (Stack + Queue)");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
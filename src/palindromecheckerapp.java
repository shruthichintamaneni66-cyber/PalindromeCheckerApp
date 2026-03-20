import java.util.Scanner;
import java.util.Stack;

public class palindromecheckerapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome (Stack Method)");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
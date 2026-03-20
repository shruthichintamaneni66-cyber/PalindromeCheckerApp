import java.util.Scanner;

public class palindromecheckerapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word: ");
            String word = sc.nextLine();

            String reversed = new StringBuilder(word).reverse().toString();

            if (word.equalsIgnoreCase(reversed)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }

            System.out.print("Continue? (yes/no): ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
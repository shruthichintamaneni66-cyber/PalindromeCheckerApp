import java.util.Scanner;

class PalindromeService {
    public boolean check(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if (service.check(word)) {
            System.out.println("Palindrome (OOP Service)");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
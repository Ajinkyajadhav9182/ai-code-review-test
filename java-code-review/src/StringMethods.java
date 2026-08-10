import java.util.Scanner;

public class StringMethods {

    static String reverse(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        return reversed;
    }

    static int countVowels(String text) {
        text = text.toLowerCase();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    static boolean isPalindrome(String text) {
        String reversed = reverse(text);

        return text.equals(reversed);
    }

    static int countWords(String sentence) {
        String[] words = sentence.split(" ");
        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        System.out.println("Reverse : " + reverse(text));
        System.out.println("Vowels  : " + countVowels(text));
        System.out.println("Words   : " + countWords(text));

        if (isPalindrome(text)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


    }
}

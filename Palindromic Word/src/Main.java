import java.util.*;
public class Main {
    public static boolean isPalindrom(String str) {
        String reverse = "";

        String word = str.toLowerCase();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        return word.equals(reverse);
    }

    public static void main(String[] args) {
        String word;

        Scanner input = new Scanner(System.in);
        System.out.print("Word enter: ");
        word = input.nextLine();

        if(isPalindrom(word) == true) {
            System.out.println(word + " is a Palindromik word.");
        }
        else {
            System.out.println(word + " isn't a Palindromik word.");
        }
    }
}

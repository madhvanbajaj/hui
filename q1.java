import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintWithoutRepeatingVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        for (String word : words) {
            StringBuilder result = new StringBuilder();
            Set<Character> seenVowels = new HashSet<>();

            for (char ch : word.toCharArray()) {
                char lowercaseCh = Character.toLowerCase(ch);
                if ("aeiou".contains(String.valueOf(lowercaseCh)) && !seenVowels.contains(lowercaseCh)) {
                    seenVowels.add(lowercaseCh);
                    result.append(ch);
                } else if (!"aeiou".contains(String.valueOf(lowercaseCh))) {
                    result.append(ch);
                }
            }

            System.out.print(result.toString() + " ");
        }

        scanner.close();
    }
}
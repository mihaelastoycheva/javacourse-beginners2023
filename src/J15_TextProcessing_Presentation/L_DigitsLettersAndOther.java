package J15_TextProcessing_Presentation;

import java.util.Scanner;

public class L_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        char[] arr = s.toCharArray();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (char c : arr) {
            if (Character.isDigit(c)) {
                digits.append(c);
            } else if (Character.isAlphabetic(c)) {
                letters.append(c);
            } else {
                others.append(c);
            }
        }

        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(others.toString());

    }
}

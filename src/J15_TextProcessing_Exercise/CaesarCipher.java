package J15_TextProcessing_Exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] += 3;
        }

        for (char element:chars) {
            System.out.print(element);
        }
    }
}

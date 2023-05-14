package J15_TextProcessing_Presentation;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < bannedWords.length; i++) {
            String replacement = repeatStr("*", bannedWords[i].length());
            text = text.replace(bannedWords[i], replacement);
        }

        System.out.println(text);
    }

    private static String repeatStr(String s, int length) {
        String replacement = "";
        for (int i = 0; i < length; i++) {
            replacement += s;
        }
        return replacement;
    }
}

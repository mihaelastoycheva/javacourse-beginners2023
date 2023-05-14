package J15_TextProcessing_Presentation;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String removeWord = scanner.nextLine();
        String text = scanner.nextLine();

        int index = text.indexOf(removeWord);
        System.out.println(index);
        while (index != -1){
            text = text.replace(removeWord, "");
            index = text.indexOf(removeWord);
            System.out.println(index);
        }

        System.out.println(text);
    }
}

package J5_WhileLoop_Presentation;

import java.util.Locale;
import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while(!text.toLowerCase().equals("stop")){
            System.out.println(text);
            text = scanner.nextLine();
        }

    }
}

package J12_Objects_PresentationLab;

import java.util.Random;
import java.util.Scanner;

public class LabRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        for (int pos1 = 0; pos1 < words.length; pos1++) {
            Random random = new Random();
            int pos2 = random.nextInt(words.length);
            words[pos1] = words[pos2];
        }

        System.out.println(String.join(System.lineSeparator(), words));

    }
}

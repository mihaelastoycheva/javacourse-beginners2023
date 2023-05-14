package J9_Arrays_Presentation;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingArraySingleLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        /*
        oder
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
         */

        for (int j : array) {
            System.out.println(j);
        }

        /*
        oder
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
         */

    }
}

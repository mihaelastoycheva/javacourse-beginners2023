package J9_Arrays_Presentation;

import java.sql.Array;
import java.util.Scanner;

public class ReverseArrayInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

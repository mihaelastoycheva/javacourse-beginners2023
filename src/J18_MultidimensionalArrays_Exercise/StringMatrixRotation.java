package J18_MultidimensionalArrays_Exercise;

import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\W+");
        int degrees = Integer.parseInt(input[1]);

        String word = scanner.nextLine();

        while(!word.equals("END")){
            word = scanner.nextLine();
        }

    }
}

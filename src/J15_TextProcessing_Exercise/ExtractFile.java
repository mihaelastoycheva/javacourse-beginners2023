package J15_TextProcessing_Exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\W+");

        System.out.printf("File name: %s\n", input[input.length - 2]);

        System.out.printf("File extension: %s", input[input.length - 1]);

    }
}

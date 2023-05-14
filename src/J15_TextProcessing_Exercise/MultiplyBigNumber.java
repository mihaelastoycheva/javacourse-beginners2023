package J15_TextProcessing_Exercise;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long first = scanner.nextLong();
        int second = Integer.parseInt(scanner.nextLine());

        long result = (first * second);

        System.out.println(result);
    }
}

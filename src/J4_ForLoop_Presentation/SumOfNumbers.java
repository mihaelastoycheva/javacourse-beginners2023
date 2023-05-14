package J4_ForLoop_Presentation;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }

        System.out.println("Result is " + sum);
    }
}

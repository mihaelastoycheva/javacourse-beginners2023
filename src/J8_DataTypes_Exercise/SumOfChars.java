package J8_DataTypes_Exercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        char symbol;

        for (int i = 0; i < n; i++) {
            symbol = scanner.next().charAt(0);
            sum += symbol;
        }
        System.out.println("The sum equals: " + sum);
    }
}

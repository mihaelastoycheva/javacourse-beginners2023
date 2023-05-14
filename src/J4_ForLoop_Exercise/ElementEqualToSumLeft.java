package J4_ForLoop_Exercise;

import java.util.Scanner;

public class ElementEqualToSumLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            sum += number;

            if (number > max){
                max = number;
            }
        }

        int sumWithoutMax = sum - max;

        if (max == sumWithoutMax){
            System.out.println("Yes! Sum = " + max);
        } else {
            System.out.println("No! Diff = " + Math.abs(max - sumWithoutMax));
        }
    }
}

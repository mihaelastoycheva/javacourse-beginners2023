package J4_ForLoop_Exercise;

import java.util.Scanner;

public class EvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double number;
        double evenSum = 0;
        double evenMax = Double.MIN_VALUE;
        double evenMin = Double.MAX_VALUE;

        double oddSum = 0;
        double oddMax = Double.MIN_VALUE;
        double oddMin = Double.MAX_VALUE;

        if (n == 0){
            System.out.println("OddSum=0.00,\nOddMin=No,\nOddMax=No,\nEvenSum=0.00,\nEvenMin=No,\nEvenMax=No");
        }

        for (int i = 1; i <= n; i++) {
            number = Double.parseDouble(scanner.nextLine());

            if (n == 1){
                System.out.printf("OddSum=%.2f,\nOddMin=%.2f,\nOddMax=%.2f,\nEvenSum=0.00,\nEvenMin=No,\nEvenMax=No", number, number, number);
                break;
            }

            if (i % 2 == 0){
                evenSum += number;
                if (number > evenMax){
                    evenMax = number;
                }
                if (number < evenMin){
                    evenMin = number;
                }
            } else {
                oddSum += number;
                if (number > oddMax){
                    oddMax = number;
                }
                if (number < oddMin){
                    oddMin = number;
                }
            }

            if (i == n){
                System.out.printf("OddSum=%.2f,\nOddMin=%.2f,\nOddMax=%.2f,\nEvenSum=%.2f,\nEvenMin=%.2f,\nEvenMax=%.2f", oddSum, oddMin, oddMax, evenSum, evenMin, evenMax);
            }
        }

    }
}

package J4_ForLoop_Exercise;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number;
        int countDividedBy2 = 0;
        int countDividedBy3 = 0;
        int countDividedby4 = 0;

        if (n <= 0 || n > 1000){
            System.out.println("Invalid input!");
            return;
        }

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0){
                countDividedBy2++;
            }
            if (number % 3 == 0){
                countDividedBy3++;
            }
            if (number % 4 == 0){
                countDividedby4++;
            }
        }

        double p1 = ((double)countDividedBy2 / (double)n) * 100;
        System.out.printf("%.2f", p1);
        System.out.print("%\n");

        double p2 = ((double)countDividedBy3 / (double)n) * 100;
        System.out.printf("%.2f", p2);
        System.out.print("%\n");

        double p3 = ((double)countDividedby4 / (double)n) * 100;
        System.out.printf("%.2f", p3);
        System.out.print("%\n");


    }
}

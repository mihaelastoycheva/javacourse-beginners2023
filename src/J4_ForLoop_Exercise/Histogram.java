package J4_ForLoop_Exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number;
        int countUnder200 = 0;
        int countBetween200And400 = 0;
        int countBetween400And600 = 0;
        int countBetween600And800 = 0;
        int countOver800 = 0;

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            if (number < 200){
                countUnder200++;
            } else if (number >= 200 && number < 400){
                countBetween200And400++;
            } else if (number >= 400 && number < 600){
                countBetween400And600++;
            } else if (number >= 600 && number < 800){
                countBetween600And800++;
            } else {
                countOver800++;
            }
        }

        double p1 = ((double)countUnder200 / (double)n) * 100;
        System.out.printf("%.2f", p1);
        System.out.print("%\n");

        double p2 = ((double)countBetween200And400 / (double)n) * 100;
        System.out.printf("%.2f", p2);
        System.out.print("%\n");

        double p3 = ((double)countBetween400And600 / (double)n) * 100;
        System.out.printf("%.2f", p3);
        System.out.print("%\n");

        double p4 = ((double)countBetween600And800 / (double)n) * 100;
        System.out.printf("%.2f", p4);
        System.out.print("%\n");

        double p5 = ((double)countOver800 / (double)n) * 100;
        System.out.printf("%.2f", p5);
        System.out.print("%\n");

    }
}

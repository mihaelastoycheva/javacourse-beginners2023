package J4_ForLoop_Presentation;

import java.util.Scanner;
import java.lang.Math;

public class LeftRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int numberLeft;
        int sumLeft = 0;
        int numberRight;
        int sumRight = 0;

        //Left sum
        for (int i = 0; i < n; i++) {
            numberLeft = Integer.parseInt(scanner.nextLine());
            sumLeft += numberLeft;
        }

        //Right sum
        for (int i = 0; i < n; i++) {
            numberRight = Integer.parseInt(scanner.nextLine());
            sumRight += numberRight;
        }

        if (sumLeft == sumRight){
            System.out.println("Yes, sum = " + sumLeft);
        } else {
            System.out.println("No, diff = " + Math.abs(sumLeft - sumRight));
        }
    }
}

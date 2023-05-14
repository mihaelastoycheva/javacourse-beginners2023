package J4_ForLoop_Presentation;

import java.util.Scanner;
import java.lang.Math;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0){ //Chetno
                evenSum += number;
            } else {        //Nechetno
                oddSum += number;
            }
        }

        if (evenSum == oddSum){
            System.out.println("Yes!\nSum = " + evenSum);
        } else {
            System.out.println("No!\nDiff = " + Math.abs(evenSum - oddSum));
        }

    }
}

package J4_ForLoop_Presentation;

import java.util.Scanner;

public class RangeOfInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int n = Integer.parseInt(scanner.nextLine());
        int number;

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }

        System.out.println("Min number is " + min);
        System.out.println("Max number is " + max);

    }
}

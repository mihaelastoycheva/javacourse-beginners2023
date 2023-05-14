package J4_ForLoop_Lab;

import java.util.Scanner;
import java.lang.Math;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0){
                int number = (int) Math.pow(2,i);
                System.out.println(number);
            }
        }
    }
}

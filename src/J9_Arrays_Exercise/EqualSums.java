package J9_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += array[j];
            }
            for (int j = i + 1; j < array.length; j++) {
                sumRight += array[j];
            }
            if (sumLeft == sumRight) {
                System.out.println(i);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("no");
        }
    }
}

package J9_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[2];

        int j = 0;
        int k = 0;

        int[] firstArrOutput = new int[n];
        int[] secondArrOutput = new int[n];

        for (int i = 0; i < n; i++) {
            arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (!(i % 2 == 0)){ //Ако е нечетно
                firstArrOutput[j] = arr[0];
                secondArrOutput[j] = arr[1];
                j++;
            } else {
                secondArrOutput[j] = arr[0];
                firstArrOutput[j] = arr[1];
                j++;
            }
        }

        for (int element : secondArrOutput) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int element : firstArrOutput) {
            System.out.print(element + " ");
        }
    }
}

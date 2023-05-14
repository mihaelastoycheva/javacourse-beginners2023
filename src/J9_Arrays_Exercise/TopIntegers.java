package J9_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < array.length; i++) {
            int localMax = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i] && localMax < array[j]){
                    localMax = array[j];
                }
            }
            if (localMax <= array[i]) System.out.print(array[i] + " ");
            }
        }
    }


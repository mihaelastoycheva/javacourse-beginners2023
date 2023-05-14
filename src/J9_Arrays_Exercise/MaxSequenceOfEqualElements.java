package J9_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Не е решена изцяло

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int counter = 1;
        int sequenceIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i-1]){
                counter++;
                sequenceIndex = i+1;
            }
        }
        for (int i = sequenceIndex - (counter - 2); i < sequenceIndex; i++) {
            System.out.println(array[i]);
        }
    }
}

package J17_StacksAndQueue_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstLine = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int elementsToPush = firstLine[0];
        int elementsToPop = firstLine[1];
        int elementToCheck = firstLine[2];


        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < elementsToPush; i++) {
            int element = Integer.parseInt(scanner.next());
            numbers.push(element);
        }

        for (int i = 0; i < elementsToPop; i++) {
            numbers.pop();
        }

        int min = Integer.MAX_VALUE;

        if (numbers.contains(elementToCheck)){
            System.out.println("true");
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                int element = numbers.pop();
                if (element < min) {
                    min = element;
                }
            }
            System.out.println(min);
        }

    }
}

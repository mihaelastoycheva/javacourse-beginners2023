package J17_StacksAndQueue_Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //При опашка се взимат елементите отляво
        //При стек се взимат елементите отдясно

        int[] firstLine = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int elementsToEnqueue = firstLine[0];
        int elementsToDequeue = firstLine[1];
        int elementToCheck = firstLine[2];

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < elementsToEnqueue; i++) {
            int element = Integer.parseInt(scanner.next());
            numbers.add(element);
        }

        for (int i = 0; i < elementsToDequeue; i++) {
            numbers.remove();
        }

        int min = Integer.MAX_VALUE;


        if (numbers.contains(elementToCheck)){
            if (numbers.isEmpty()){
                System.out.println("0");
            } else {
                System.out.println("true");
            }
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                int element = numbers.remove();
                if (element < min) {
                    min = element;
                }
            }
            if (numbers.isEmpty()){
                System.out.println("0");
            } else {
                System.out.println(min);
            }
        }
    }
}

package J17_StacksAndQueue_Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfCommands = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int[] input;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < countOfCommands; i++) {
            input = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (input[0] == 1){
                stack.push(input[1]);
            } else if (input[0] == 2){
                stack.pop();
            } else if (input[0] == 3){
                ArrayDeque<Integer> secondStack = stack.clone();
                for (int j = 0; j < stack.size(); j++) {
                    int element = secondStack.pop();
                    if (element > max) {
                        max = element;
                    }
                }
                System.out.println(max);
                max = Integer.MIN_VALUE;
            }
        }
    }
}

package J17_StacksAndQueues_PresentationLab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> operations = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        ArrayDeque<String> stack = new ArrayDeque<>(operations);

        while(stack.size() > 1){
            int first = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int second = Integer.parseInt(stack.pop());

            if (operation.equals("+")){
                stack.push(String.valueOf(first + second));
            } else if (operation.equals("-")){
                stack.push(String.valueOf(first - second));
            }
        }

        System.out.println(stack.pop());
    }
}

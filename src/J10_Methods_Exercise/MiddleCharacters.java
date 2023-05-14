package J10_Methods_Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        System.out.println(getMiddleChar(input));
    }

    public static String getMiddleChar(char[] input){
        int divide = 0;

        if ((input.length + 1) % 2 == 0){
            divide = input.length / 2;
            char[] middle = {input[divide]};
            return new String (middle);
        } else {
            divide = input.length / 2;
            char[] middle = {input[divide - 1], input[divide]};
            return new String (middle);
        }
    }
}

package J10_Methods_Exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        System.out.println(getVowelsCount(input));
    }

    public static int getVowelsCount (char[] input){
        int counter = 0;

        for (char c : input) {
            if (c == 'a' || c == 'e' || c == 'o' || c == 'i') {
                counter++;
            }
        }

        /* Същия запис:
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 'a' || input[i] == 'e' || input[i] == 'o' || input[i] == 'i'){
                counter++;
            }
        }
         */

        return counter;
    }
}

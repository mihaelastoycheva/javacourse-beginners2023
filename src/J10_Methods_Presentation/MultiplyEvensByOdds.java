package J10_Methods_Presentation;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultipleOfEvensAndOdds(input));
    }
    public static int getMultipleOfEvensAndOdds(int input){
        int evenDigits = getSumOfEvenDigits(input);
        int oddDigits = getSumOfOddDigits(input);
        int result = evenDigits * oddDigits;
        return result;
    }

    private static int getSumOfOddDigits(int input) {
        int countOdd = 0;

        while (input != 0) {
            int lastdigit = input % 10;
            if (!(lastdigit % 2 == 0)) {
                countOdd += lastdigit;
            }
            input = input / 10;
        }
        return countOdd;
    }

    private static int getSumOfEvenDigits(int input) {
        int countEven = 0;

        while (input != 0) {
            int lastdigit = input % 10;
            if (lastdigit % 2 == 0) {
                countEven += lastdigit;
            }
            input = input / 10;
        }
        return countEven;
    }

}

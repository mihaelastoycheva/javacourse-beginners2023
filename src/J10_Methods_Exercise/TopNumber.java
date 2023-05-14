package J10_Methods_Exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        getTopNumbers(input);
    }

    public static int getSumOfDigits(int input){
        int sum = 0;
        while(input != 0)
        {
            int remainder = input % 10;
            input = input / 10;
            sum += remainder;
        }
        return sum;
    }

    public static int getCountOfOddDigits(int input){
        int oddDigit = 0;
        while(input != 0)
        {
            int remainder = input % 10;
            input = input / 10;
            if (!(remainder % 2 == 0)){
                oddDigit++;
            }
        }
        return oddDigit;
    }

    public static void getTopNumbers(int input){
        for (int i = 0; i < input; i++) {
            if (getSumOfDigits(i) % 8 == 0 && getCountOfOddDigits(i) >= 1){
                System.out.print(i + " ");
            }
        }
    }
}
